package com.movies.tMovies.service.admin;

import com.movies.tMovies.dto.CardInfoDto;

import java.util.List;

public interface AdminTransactionServiceImpl {

    List<CardInfoDto> getAllTransaction();
}
