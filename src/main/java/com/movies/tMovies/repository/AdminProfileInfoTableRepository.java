package com.movies.tMovies.repository;

import com.movies.tMovies.entity.AdminProfileInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminProfileInfoTableRepository extends JpaRepository<AdminProfileInfoEntity,Long> {

    @Query(value = "Select p from AdminProfileInfoEntity p")
    AdminProfileInfoEntity getAllData();
}
