package com.movies.tMovies.service.impl.admin;

import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.entity.UsersEntity;
import com.movies.tMovies.enumuration.Role;
import com.movies.tMovies.repository.AdminRegisterRepository;
import com.movies.tMovies.repository.UserRepository;
import com.movies.tMovies.service.admin.AdminRegisterServiceImpl;
import com.movies.tMovies.service.impl.tmovies.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminRegisterService implements AdminRegisterServiceImpl {

    private final AdminRegisterRepository adminRegisterRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean save(UsersAccessDto usersAccessDto) {

        var user = UsersEntity.builder()
                .username(usersAccessDto.getUsername())
                .password(passwordEncoder.encode(usersAccessDto.getPassword()))
                .role(Role.ADMIN)
                .build();
        var check = adminRegisterRepository.findByUsername(usersAccessDto.getUsername());
        if (check.isPresent()){
            return false;
        }else {
            adminRegisterRepository.save(user);
            return true;
        }
    }
}
