package com.movies.tMovies.service.impl.admin;

import com.movies.tMovies.mapper.AdminProfileInfoMapper;
import com.movies.tMovies.repository.AdminCardsCenterRepository;
import com.movies.tMovies.service.admin.AdminCardsCenterServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
