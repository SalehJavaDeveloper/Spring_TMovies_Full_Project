package com.movies.tMovies.service.impl.tmovies;

import com.movies.tMovies.dto.ShopCardDto;
import com.movies.tMovies.entity.ShopCardEntity;
import com.movies.tMovies.mapper.ShopCardMapper;
import com.movies.tMovies.repository.ShopCardRepository;
import com.movies.tMovies.service.tmovies.ShoppingCardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShoppingCardService implements ShoppingCardServiceImpl {

    private final ShopCardRepository shopCardRepository;

    private final ShopCardMapper shopCardMapper;

    @Override
    public List<ShopCardDto> getAllMovies() {
        List<ShopCardEntity> shopCardEntities = shopCardRepository.findAll();
        return shopCardMapper.toDTOList(shopCardEntities);
    }

    @Override
    public boolean findByMovieName(String movieName) {
        var check = shopCardRepository.findByTMoviesMovieName(movieName);
      if(!check.isPresent()){
          return true;
      }else return false;
    }


    @Override
    public void deleteShopCardMovie(Long id) {
       shopCardRepository.deleteById(id);
    }

    @Override
    public void deleteAllShopCardMovies() {
        shopCardRepository.deleteAll();
    }

    @Override
    public void saveShopCardMovies(ShopCardEntity shopCardEntity) {
        shopCardRepository.save(shopCardEntity);
    }
}
