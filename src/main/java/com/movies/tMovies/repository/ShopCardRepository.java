package com.movies.tMovies.repository;

import com.movies.tMovies.entity.ShopCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface ShopCardRepository extends JpaRepository<ShopCardEntity,Long> {


    Optional<ShopCardEntity> findByTMoviesMovieName(String tMoviesName);
}
