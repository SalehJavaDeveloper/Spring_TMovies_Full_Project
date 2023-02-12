package com.movies.tMovies.service.impl.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.repository.TMovies_TvSeriesRepository;
import com.movies.tMovies.service.tmovies.TMoviesTvSeriesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TMoviesTvSeriesService implements TMoviesTvSeriesImpl {
    private final TMovies_TvSeriesRepository tMovies_tvSeriesRepository;
    private final TMoviesMapper tMoviesMapper;
    @Override
    public List<TMoviesDTO> getDataByTvSeries(String movieType) {
       List<TMoviesEntity> tMoviesEntityList = tMovies_tvSeriesRepository.findByMovieType(movieType);
       return tMoviesMapper.toDTOList(tMoviesEntityList);
    }
}
