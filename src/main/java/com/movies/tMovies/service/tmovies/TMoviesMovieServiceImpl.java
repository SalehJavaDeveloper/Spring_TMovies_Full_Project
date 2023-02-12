package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;

import java.util.List;

public interface TMoviesMovieServiceImpl {
    List<TMoviesDTO> findByMovieType(String movieType);
    List<TMoviesDTO> findAllData();
}
