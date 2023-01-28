package com.movies.tMovies.service;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.entity.TMoviesMainDetailEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.repository.TMoviesHomeRepository;
import com.movies.tMovies.service.Impl.TMoviesHomeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TMoviesHomeService implements TMoviesHomeServiceImpl {

    private final TMoviesHomeRepository tMoviesHomeRepository;
    private final TMoviesMapper tMoviesMapper;

    @Override
    public List<TMoviesDTO> findAllPagableData(Pageable pageable) {
      List<TMoviesEntity> entityList = tMoviesHomeRepository.findAllPagableData(pageable);
      return tMoviesMapper.toDTOList(entityList);
    }

    @Override
    public TMoviesDTO findAllById(Long id) {
        TMoviesEntity tMoviesEntities = tMoviesHomeRepository.findById(id).get();
        return tMoviesMapper.toDTO(tMoviesEntities);
    }

    @Override
    public TMoviesDTO saveMovies(TMoviesEntity tMovies) {
        TMoviesEntity tMoviesEntity = tMoviesHomeRepository.save(tMovies);
        return tMoviesMapper.toDTO(tMoviesEntity);
    }

    @Override
    public void deleteById(Long id) {
         tMoviesHomeRepository.deleteById(id);
    }


}
