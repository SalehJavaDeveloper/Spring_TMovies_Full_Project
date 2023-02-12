package com.movies.tMovies.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class UsersAccessDto {

    private String username;

    private String password;
}
