package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.LoginDetailsDto;
import com.movies.tMovies.entity.LoginDetailsEntity;

public interface LoginDetailsImpl {

    LoginDetailsDto saveLoginDetails(LoginDetailsEntity loginDetailsEntity);


}
