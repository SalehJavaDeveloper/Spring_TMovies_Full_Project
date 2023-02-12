package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.CardInfoDto;
import com.movies.tMovies.entity.CardInfoEntity;

public interface CardInfoImpl {

    CardInfoDto saveCardInfo(CardInfoEntity cardInfoEntity);

}
