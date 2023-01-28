package com.movies.tMovies.service.Impl;

import com.movies.tMovies.dto.TMoviesDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMovies_MainPageServiceImpl {

    TMoviesDTO getStudentById(Long id);

    List<TMoviesDTO> findAllData();
}
