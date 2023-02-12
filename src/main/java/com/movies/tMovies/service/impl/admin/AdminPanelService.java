package com.movies.tMovies.service.impl.admin;

import com.movies.tMovies.repository.AdminPanelRepository;
import com.movies.tMovies.service.admin.AdminPanelServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminPanelService implements AdminPanelServiceImpl {
    private final AdminPanelRepository adminPanelRepository;

    @Override
    public int getSum() {
        return adminPanelRepository.getSum();
    }

    @Override
    public int getCount() {
        return adminPanelRepository.getCount();
    }

    @Override
    public int getMoviesCount() {
        return adminPanelRepository.getMoviesCount();
    }

    @Override
    public int getAvgBalance() {
        return adminPanelRepository.getAvgBalance();
    }

}
