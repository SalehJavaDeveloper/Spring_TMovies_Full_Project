package com.movies.tMovies.repository;

import com.movies.tMovies.entity.TMoviesEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TMoviesHomeRepository extends JpaRepository<TMoviesEntity,Long> {
    @Query(value = "SELECT p FROM TMoviesEntity p")
    List<TMoviesEntity> findAllPagableData(Pageable pageable);

    void deleteById(Long id);

}
