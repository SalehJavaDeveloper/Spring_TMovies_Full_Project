package com.movies.tMovies.service;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.repository.TMovies_MoviesRepository;
import com.movies.tMovies.service.Impl.TMovies_MovieServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TMovies_MovieService implements TMovies_MovieServiceImpl {

    private final TMovies_MoviesRepository tMoviesRepository;
    private final TMoviesMapper tMoviesMapper;

    @Override
    public List<TMoviesDTO> findByUniqeId(int uniqeId) {
       List<TMoviesEntity> tMovies = tMoviesRepository.findByUniqeId(uniqeId);
       return tMoviesMapper.toDTOList(tMovies);
    }

    @Override
    public List<TMoviesDTO> findAllData() {
        List<TMoviesEntity> tMoviesEntities = tMoviesRepository.findAll();
        return tMoviesMapper.toDTOList(tMoviesEntities);
    }
}
