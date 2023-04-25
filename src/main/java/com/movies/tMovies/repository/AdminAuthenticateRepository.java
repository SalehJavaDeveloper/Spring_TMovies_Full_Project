package com.movies.tMovies.repository;

import com.movies.tMovies.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAuthenticateRepository extends JpaRepository<UsersEntity,Integer> {
    UsersEntity findByUsername(String username);
}
