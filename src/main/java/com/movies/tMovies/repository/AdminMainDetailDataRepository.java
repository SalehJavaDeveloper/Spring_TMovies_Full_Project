package com.movies.tMovies.repository;

import com.movies.tMovies.entity.TMoviesMainDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminMainDetailDataRepository extends JpaRepository<TMoviesMainDetailEntity,Long> {

}
