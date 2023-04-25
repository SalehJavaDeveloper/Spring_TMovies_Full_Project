package com.movies.tMovies.service.tmovies;

import com.movies.tMovies.dto.ShopCardDto;
import com.movies.tMovies.entity.ShopCardEntity;

import java.util.List;
import java.util.Optional;

public interface ShoppingCardServiceImpl {
    List<ShopCardDto> getAllMovies();

    boolean findByMovieName(String movieName);

    void deleteShopCardMovie(Long id);
    void deleteAllShopCardMovies();

    void saveShopCardMovies(ShopCardEntity shopCardEntity);
}
