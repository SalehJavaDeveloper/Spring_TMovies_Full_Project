package com.movies.tMovies.mapper;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface TMoviesMapper
{
    TMoviesDTO toDTO(TMoviesEntity productEntity);

    List<TMoviesDTO> toDTOList(List<TMoviesEntity> entities);

    List<TMoviesEntity> fromDTOList(List<TMoviesDTO> dtoList);

    TMoviesEntity fromDTO(TMoviesDTO dto);
}
