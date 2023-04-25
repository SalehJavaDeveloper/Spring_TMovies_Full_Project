package com.movies.tMovies.service.admin;

import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.dto.UsersDto;
import com.movies.tMovies.entity.UsersEntity;

import java.util.List;

public interface AdminUserDetailDataServiceImpl {

    List<UsersDto> getAllUsers();
    boolean saveUser(UsersEntity usersEntity);

    void deleteUserById(Integer id);

    UsersDto findUserById(Integer id);
     boolean savemain(Integer id,UsersEntity usersEntity);
    boolean verifyUserDetails(UsersAccessDto usersAccessDto);
}
