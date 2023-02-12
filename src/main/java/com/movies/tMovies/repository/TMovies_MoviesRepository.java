package com.movies.tMovies.repository;

import com.movies.tMovies.entity.TMoviesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMovies_MoviesRepository extends JpaRepository<TMoviesEntity,Long> {
    List<TMoviesEntity> findByMovieType(String movieType);
}
