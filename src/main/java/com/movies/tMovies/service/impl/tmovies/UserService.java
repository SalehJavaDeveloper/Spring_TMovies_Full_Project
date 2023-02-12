package com.movies.tMovies.service.impl.tmovies;

import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.dto.UsersDto;
import com.movies.tMovies.entity.UsersEntity;
import com.movies.tMovies.enumuration.Role;
import com.movies.tMovies.exception.AuthenticationException;
import com.movies.tMovies.mapper.UsersMapper;
import com.movies.tMovies.repository.UserRepository;
import com.movies.tMovies.service.tmovies.UsersServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UsersServiceImpl {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    @Override
    public Optional<UsersDto> findByUsername(String username) {
        var user = userRepository.findByUsername(username).orElseThrow();
        return null;
    }

    @Override
    public boolean save(UsersAccessDto usersAccessDto) {
        var user = UsersEntity.builder()
                .username(usersAccessDto.getUsername())
                .password(passwordEncoder.encode(usersAccessDto.getPassword()))
                .role(Role.USER)
                .build();
        var check = userRepository.findByUsername(usersAccessDto.getUsername());
        if (check.isPresent()) {
            return false;
        } else {
            userRepository.save(user);
            return true;
        }
    }

    @Override
    public boolean verifyUserDetails(UsersAccessDto usersAccessDto) throws AuthenticationException{
        var user = userRepository.findByUsername(usersAccessDto.getUsername()).isPresent();
        if(!user){
            throw new AuthenticationException(HttpStatus.UNAUTHORIZED, 401, String.format("UNAUTHORIZED"));
        }
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        usersAccessDto.getUsername(),
                        usersAccessDto.getPassword()
                )
        );

     if (user){
         return true;
     }else return false;

    }


}
