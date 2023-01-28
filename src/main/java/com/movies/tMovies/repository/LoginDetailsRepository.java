package com.movies.tMovies.repository;

import com.movies.tMovies.entity.LoginDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDetailsRepository extends JpaRepository<LoginDetailsEntity,Long> {
}
