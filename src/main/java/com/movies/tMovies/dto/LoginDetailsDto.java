package com.movies.tMovies.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDetailsDto {
    private int login_id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
}
