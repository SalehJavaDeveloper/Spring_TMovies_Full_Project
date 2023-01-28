package com.movies.tMovies.service;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.repository.TMovies_MainPageRepository;
import com.movies.tMovies.service.Impl.TMovies_MainPageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TMovies_MainPageService implements TMovies_MainPageServiceImpl {

    private final TMovies_MainPageRepository tMovies_mainPageRepository;
    private final TMoviesMapper tMoviesMapper;

    @Override
    public TMoviesDTO getStudentById(Long id) {
      TMoviesEntity tMovies = tMovies_mainPageRepository.findById(id).get();
      return tMoviesMapper.toDTO(tMovies);
    }

    @Override
    public List<TMoviesDTO> findAllData() {
        List<TMoviesEntity> tMovies = tMovies_mainPageRepository.findAllData();
        return tMoviesMapper.toDTOList(tMovies);
    }


}
