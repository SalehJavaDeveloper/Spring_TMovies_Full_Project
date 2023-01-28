package com.movies.tMovies.service.Impl;

import com.movies.tMovies.dto.TMoviesDTO;

import java.util.List;

public interface TMovies_TvSeriesImpl {
    List<TMoviesDTO> getDataByTvSeries(int uniqeId);
}
