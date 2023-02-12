package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMoviesMainPageServiceImpl {

    TMoviesDTO getMovieById(Long id);

    List<TMoviesDTO> findAllData();
}
