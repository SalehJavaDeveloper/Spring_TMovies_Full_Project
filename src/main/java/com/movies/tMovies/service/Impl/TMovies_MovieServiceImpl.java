package com.movies.tMovies.service.Impl;

import com.movies.tMovies.dto.TMoviesDTO;

import java.util.List;

public interface TMovies_MovieServiceImpl {
    List<TMoviesDTO> findByUniqeId(int uniqeId);
    List<TMoviesDTO> findAllData();
}
