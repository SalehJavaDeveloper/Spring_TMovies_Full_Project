package com.movies.tMovies.service.impl.admin;

import com.movies.tMovies.dto.CardInfoDto;
import com.movies.tMovies.entity.CardInfoEntity;
import com.movies.tMovies.mapper.CardInfoMapper;
import com.movies.tMovies.repository.AdminTransactionRepository;
import com.movies.tMovies.service.admin.AdminTransactionServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminTransactionService implements AdminTransactionServiceImpl {

    private final AdminTransactionRepository adminTransactionRepository;

    private final CardInfoMapper cardInfoMapper;
    @Override
    public List<CardInfoDto> getAllTransaction() {
        List<CardInfoEntity> cardInfoEntities = adminTransactionRepository.findAll();
        return cardInfoMapper.toDTOList(cardInfoEntities);
    }
}
