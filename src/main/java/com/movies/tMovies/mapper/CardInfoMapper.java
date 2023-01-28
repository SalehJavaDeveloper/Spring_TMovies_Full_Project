package com.movies.tMovies.mapper;

import com.movies.tMovies.dto.CardInfoDto;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.CardInfoEntity;
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
public interface CardInfoMapper {
    CardInfoDto toDTO(CardInfoEntity productEntity);

    List<CardInfoDto> toDTOList(List<CardInfoEntity> entities);

    List<CardInfoEntity> fromDTOList(List<CardInfoDto> dtoList);

    CardInfoEntity fromDTO(CardInfoDto dto);
}
