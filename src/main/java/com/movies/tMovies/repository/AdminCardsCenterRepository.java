package com.movies.tMovies.repository;

import com.movies.tMovies.entity.AdminProfileInfoEntity;
import com.movies.tMovies.entity.CardInfoEntity;
import com.movies.tMovies.entity.TMoviesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminCardsCenterRepository extends JpaRepository<AdminProfileInfoEntity,Long> {
    @Query(value = "SELECT sum(cashCard) from CardInfoEntity")
    int getSum();
}
