package com.movies.tMovies.service.impl.admin;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.repository.AdminTableTMoviesRepository;
import com.movies.tMovies.service.admin.AdminTableTMoviesServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminTableTmoviesService implements AdminTableTMoviesServiceImpl {

    private final AdminTableTMoviesRepository adminTableTMoviesRepository;

    private final TMoviesMapper tMoviesMapper;

    @Override
    public List<TMoviesDTO> getAllMovies() {
        List<TMoviesEntity> tMoviesEntities = adminTableTMoviesRepository.findAll();
        return tMoviesMapper.toDTOList(tMoviesEntities);
    }

    @Override
    public TMoviesDTO saveNewData(TMoviesEntity tMoviesEntity) {
        TMoviesEntity moviesEntity = adminTableTMoviesRepository.save(tMoviesEntity);
        return tMoviesMapper.toDTO(moviesEntity);
    }

    @Override
    public void deleteMovieById(Long id) {
        adminTableTMoviesRepository.deleteById(id);
    }

    @Override
    public TMoviesDTO findById(Long id) {
        TMoviesEntity tMoviesEntity = adminTableTMoviesRepository.findById(id).get();
        return tMoviesMapper.toDTO(tMoviesEntity);
    }


}
