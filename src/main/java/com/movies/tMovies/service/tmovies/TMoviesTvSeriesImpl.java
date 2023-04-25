package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;

import java.util.List;

public interface TMoviesTvSeriesImpl {
    List<TMoviesDTO> getDataByTvSeries(String movieType);
}
