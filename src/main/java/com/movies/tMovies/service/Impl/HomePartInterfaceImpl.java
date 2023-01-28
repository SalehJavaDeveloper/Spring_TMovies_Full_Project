package com.movies.tMovies.service.Impl;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;

import java.util.List;

public interface HomePartInterfaceImpl {
    List<TMoviesDTO> getAllAboutData();
    TMoviesDTO getStudentById(Long id);

}
