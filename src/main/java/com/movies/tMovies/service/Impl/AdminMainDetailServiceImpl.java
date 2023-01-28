package com.movies.tMovies.service.Impl;

import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesMainDetailEntity;

import java.util.List;

public interface AdminMainDetailServiceImpl {

    List<TMoviesMainDetailDto> getAllData();

    TMoviesMainDetailDto saveMainDetail(TMoviesMainDetailEntity tMoviesMainDetailEntity);

    void deleteMainDetail(Long id);

    TMoviesMainDetailDto findMainDetailById(Long id);
}
