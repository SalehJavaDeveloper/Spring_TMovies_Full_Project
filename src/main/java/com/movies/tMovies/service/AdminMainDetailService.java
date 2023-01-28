package com.movies.tMovies.service;

import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesMainDetailEntity;
import com.movies.tMovies.mapper.TMoviesMainDetailMapper;
import com.movies.tMovies.repository.AdminMainDetailDataRepository;
import com.movies.tMovies.service.Impl.AdminMainDetailServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminMainDetailService implements AdminMainDetailServiceImpl {

    private final AdminMainDetailDataRepository adminMainDetailDataRepository;

    private final TMoviesMainDetailMapper tMoviesMainDetailMapper;


    @Override
    public List<TMoviesMainDetailDto> getAllData() {
        List<TMoviesMainDetailEntity> tMoviesMainDetailEntities = adminMainDetailDataRepository.findAll();
        return tMoviesMainDetailMapper.toDTOList(tMoviesMainDetailEntities);
    }

    @Override
    public TMoviesMainDetailDto saveMainDetail(TMoviesMainDetailEntity tMoviesMainDetailEntity) {
        TMoviesMainDetailEntity tMoviesMainDetailEntity1 = adminMainDetailDataRepository.save(tMoviesMainDetailEntity);
        return tMoviesMainDetailMapper.toDTO(tMoviesMainDetailEntity1);
    }

    @Override
    public void deleteMainDetail(Long id) {
        adminMainDetailDataRepository.deleteById(id);
    }

    @Override
    public TMoviesMainDetailDto findMainDetailById(Long id) {
        TMoviesMainDetailEntity tMoviesMainDetailEntity = adminMainDetailDataRepository.findById(id).get();
        return tMoviesMainDetailMapper.toDTO(tMoviesMainDetailEntity);
    }


}
