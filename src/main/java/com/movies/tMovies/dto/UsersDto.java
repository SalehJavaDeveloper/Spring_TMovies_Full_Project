package com.movies.tMovies.dto;

import com.movies.tMovies.enumuration.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsersDto {

    private Integer userId;
    private String username;
    private String password;
    private Role role;
}
