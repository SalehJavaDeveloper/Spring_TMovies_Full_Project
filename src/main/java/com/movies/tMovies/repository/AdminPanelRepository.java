package com.movies.tMovies.repository;

import com.movies.tMovies.entity.CardInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminPanelRepository extends JpaRepository<CardInfoEntity,Long> {

    @Query(value = "SELECT sum(cashCard) from CardInfoEntity")
    int getSum();

    @Query(value = "SELECT count(cashCard) from CardInfoEntity")
    int getCount();

    @Query(value = "SELECT count(id) from TMoviesEntity")
    int getMoviesCount();

    @Query(value = "SELECT avg(cashCard) from CardInfoEntity")
    int getAvgBalance();
}
