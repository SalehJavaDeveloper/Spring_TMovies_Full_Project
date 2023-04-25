package com.movies.tMovies.service.impl.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.repository.TMovies_MoviesRepository;
import com.movies.tMovies.service.tmovies.TMoviesMovieServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TMoviesMovieService implements TMoviesMovieServiceImpl {

    private final TMovies_MoviesRepository tMoviesRepository;
    private final TMoviesMapper tMoviesMapper;

    @Override
    public List<TMoviesDTO> findByMovieType(String movieType) {
       List<TMoviesEntity> tMovies = tMoviesRepository.findByMovieType(movieType);
       return tMoviesMapper.toDTOList(tMovies);
    }

    @Override
    public List<TMoviesDTO> findAllData() {
        List<TMoviesEntity> tMoviesEntities = tMoviesRepository.findAll();
        return tMoviesMapper.toDTOList(tMoviesEntities);
    }
}
