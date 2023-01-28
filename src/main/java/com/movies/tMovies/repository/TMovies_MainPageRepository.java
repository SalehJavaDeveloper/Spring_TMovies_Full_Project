package com.movies.tMovies.repository;

import com.movies.tMovies.entity.TMoviesEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TMovies_MainPageRepository extends JpaRepository<TMoviesEntity,Long> {
    @Query(value = "SELECT p FROM TMoviesEntity p")
    List<TMoviesEntity> findAllData();
}
