package com.movies.tMovies.service.impl.tmovies;

import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesMainDetailEntity;
import com.movies.tMovies.mapper.TMoviesMainDetailMapper;
import com.movies.tMovies.repository.TMoviesMainDetailRepository;
import com.movies.tMovies.service.tmovies.TMoviesMainDetailServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TMoviesMainDetailService implements TMoviesMainDetailServiceImpl {

    private final TMoviesMainDetailRepository tMoviesMainDetailRepository;
    private final TMoviesMainDetailMapper tMoviesMainDetailMapper;

    @Override
    public List<TMoviesMainDetailDto> getDataByMainDetailMovie() {
        List<TMoviesMainDetailEntity> tMoviesMainDetailEntities = tMoviesMainDetailRepository.findAll();
        return tMoviesMainDetailMapper.toDTOList(tMoviesMainDetailEntities);
    }
}
