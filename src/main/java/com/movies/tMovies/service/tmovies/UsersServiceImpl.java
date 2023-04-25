package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.dto.UsersDto;
import com.movies.tMovies.entity.UsersEntity;

import java.util.Optional;

public interface UsersServiceImpl {

    Optional<UsersDto> findByUsername(String username);

    boolean save(UsersAccessDto usersAccessDto);

    boolean verifyUserDetails(UsersAccessDto usersAccessDto);
}
