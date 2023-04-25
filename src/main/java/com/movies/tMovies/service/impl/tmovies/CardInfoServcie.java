package com.movies.tMovies.service.impl.tmovies;

import com.movies.tMovies.dto.CardInfoDto;
import com.movies.tMovies.entity.CardInfoEntity;
import com.movies.tMovies.mapper.CardInfoMapper;
import com.movies.tMovies.repository.CardInfoRepository;
import com.movies.tMovies.service.tmovies.CardInfoImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardInfoServcie implements CardInfoImpl {

    private final CardInfoRepository cardInfoRepository;
    private final CardInfoMapper cardInfoMapper;

    @Override
    public CardInfoDto saveCardInfo(CardInfoEntity cardInfoEntity) {
        CardInfoEntity cardInfoEntity1 = cardInfoRepository.save(cardInfoEntity);
        return cardInfoMapper.toDTO(cardInfoEntity1);
    }
}
