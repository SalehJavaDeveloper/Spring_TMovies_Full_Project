package com.movies.tMovies.service.admin;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;

import java.util.List;

public interface AdminTableTMoviesServiceImpl{

    List<TMoviesDTO> getAllMovies();

    TMoviesDTO saveNewData(TMoviesEntity tMoviesEntity);

     void deleteMovieById(Long id);

     TMoviesDTO findById(Long id);


}
