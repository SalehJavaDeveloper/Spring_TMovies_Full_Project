package com.movies.tMovies.repository;

import com.movies.tMovies.entity.CardInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardInfoRepository extends JpaRepository<CardInfoEntity,Long> {
}
