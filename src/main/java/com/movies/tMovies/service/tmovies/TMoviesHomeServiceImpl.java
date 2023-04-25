package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TMoviesHomeServiceImpl {
    List<TMoviesDTO> findAllPagableData(Pageable pageable);

    TMoviesDTO findAllById(Long id);

    TMoviesDTO saveMovies(TMoviesEntity tMovies);

    void deleteById(Long id);
}
