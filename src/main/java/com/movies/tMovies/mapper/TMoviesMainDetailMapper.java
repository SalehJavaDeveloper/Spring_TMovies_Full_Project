package com.movies.tMovies.mapper;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.entity.TMoviesMainDetailEntity;
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
public interface TMoviesMainDetailMapper {
    TMoviesMainDetailDto toDTO(TMoviesMainDetailEntity productEntity);

    List<TMoviesMainDetailDto> toDTOList(List<TMoviesMainDetailEntity> entities);

    List<TMoviesMainDetailEntity> fromDTOList(List<TMoviesMainDetailDto> dtoList);

    TMoviesMainDetailEntity fromDTO(TMoviesMainDetailDto dto);
}
