package com.movies.tMovies.service;

import com.movies.tMovies.dto.AdminProfileInfoDto;
import com.movies.tMovies.entity.AdminProfileInfoEntity;
import com.movies.tMovies.mapper.AdminProfileInfoMapper;
import com.movies.tMovies.repository.AdminCardsCenterRepository;
import com.movies.tMovies.service.Impl.AdminCardsCenterServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminCardsCenterService implements AdminCardsCenterServiceImpl {

    private final AdminCardsCenterRepository adminCardsCenterRepository;
    private final AdminProfileInfoMapper adminProfileInfoMapper;

    @Override
    public int getSum() {
        return adminCardsCenterRepository.getSum();
    }



}
