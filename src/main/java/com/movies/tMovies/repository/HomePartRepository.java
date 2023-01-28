package com.movies.tMovies.repository;

import com.movies.tMovies.entity.TMoviesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePartRepository extends JpaRepository<TMoviesEntity,Long>{
}
