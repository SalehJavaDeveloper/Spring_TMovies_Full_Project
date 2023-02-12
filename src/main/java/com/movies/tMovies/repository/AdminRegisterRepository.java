package com.movies.tMovies.repository;

import com.movies.tMovies.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRegisterRepository extends JpaRepository<UsersEntity,Integer> {
    Optional<UsersEntity> findByUsername(String username);
}
