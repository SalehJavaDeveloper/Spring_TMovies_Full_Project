package com.movies.tMovies.service;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.repository.TMovies_MoviesRepository;
import com.movies.tMovies.repository.TMovies_TvSeriesRepository;
import com.movies.tMovies.service.Impl.TMovies_TvSeriesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TMovies_TvSeriesService implements TMovies_TvSeriesImpl {
    private final TMovies_TvSeriesRepository tMovies_tvSeriesRepository;
    private final TMoviesMapper tMoviesMapper;
    @Override
    public List<TMoviesDTO> getDataByTvSeries(int uniqeId) {
       List<TMoviesEntity> tMoviesEntityList = tMovies_tvSeriesRepository.findByUniqeId(uniqeId);
       return tMoviesMapper.toDTOList(tMoviesEntityList);
    }
}
