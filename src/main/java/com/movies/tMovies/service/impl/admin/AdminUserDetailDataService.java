package com.movies.tMovies.service.impl.admin;

import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.dto.UsersDto;
import com.movies.tMovies.entity.UsersEntity;
import com.movies.tMovies.enumuration.Role;
import com.movies.tMovies.exception.AuthenticationException;
import com.movies.tMovies.mapper.UsersMapper;
import com.movies.tMovies.repository.AdminAuthenticateRepository;
import com.movies.tMovies.repository.AdminUserDetailDataRepository;
import com.movies.tMovies.service.admin.AdminUserDetailDataServiceImpl;
import com.movies.tMovies.service.impl.tmovies.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminUserDetailDataService implements AdminUserDetailDataServiceImpl {
    private final AdminUserDetailDataRepository adminUserDetailDataRepository;

    private final UsersMapper usersMapper;

    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;
    private final AdminAuthenticateRepository adminAuthenticateRepository;


    @Override
    public List<UsersDto> getAllUsers() {
        List<UsersEntity> usersEntity = adminUserDetailDataRepository.findAll();
        return usersMapper.toDTOList(usersEntity);
    }

    @Override
    public boolean saveUser(UsersEntity usersEntity) {
        UsersEntity usersEntity1 = new UsersEntity();
        usersEntity1.setUsername(usersEntity.getUsername());
        usersEntity1.setPassword(passwordEncoder.encode(usersEntity.getPassword()));
        usersEntity1.setRole(usersEntity.getRole());
        var check = adminUserDetailDataRepository.findByUsername(usersEntity.getUsername());
        if (check.isPresent()){
           return false;
        }else {
            adminUserDetailDataRepository.save(usersEntity1);
            return true;
        }

    }
    @Override
    public boolean savemain(Integer id, UsersEntity usersEntity) {
        UsersDto usersDto = findUserById(id);
        UsersEntity usersEntity1 = usersMapper.fromDTO(usersDto);
        usersEntity1.setUserId(id);
        usersEntity1.setUsername(usersEntity.getUsername());
        usersEntity1.setPassword(passwordEncoder.encode(usersEntity.getPassword()));
        usersEntity1.setRole(usersEntity.getRole());
        var check = adminUserDetailDataRepository.findByUsername(usersEntity.getUsername());
        if (check.isPresent()){
            return false;
        }else {
            adminUserDetailDataRepository.save(usersEntity1);
            return true;
        }
    }

    @Override
    public void deleteUserById(Integer id) {
      adminUserDetailDataRepository.deleteById(id);
    }

    @Override
    public UsersDto findUserById(Integer id) {
        UsersEntity usersEntity = adminUserDetailDataRepository.findById(id).orElseThrow();
        return usersMapper.toDTO(usersEntity);
    }
    @Override
    public boolean verifyUserDetails(UsersAccessDto usersAccessDto) {
        var user = adminUserDetailDataRepository.findByUsername(usersAccessDto.getUsername()).isPresent();
        if(!user){
            throw new AuthenticationException(HttpStatus.UNAUTHORIZED, 401, String.format("UNAUTHORIZED"));
        }
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        usersAccessDto.getUsername(),
                        usersAccessDto.getPassword()
                )
        );

       var mainuser = adminAuthenticateRepository.findByUsername(usersAccessDto.getUsername());
        if (user && mainuser.getRole() == Role.ADMIN){
            return true;
        }else return false;
    }
}
