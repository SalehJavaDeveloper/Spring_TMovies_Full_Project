package com.movies.tMovies.repository;

import com.movies.tMovies.entity.CardInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminTransactionRepository extends JpaRepository<CardInfoEntity,Long> {

}
