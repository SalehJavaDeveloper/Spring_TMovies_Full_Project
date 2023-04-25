package com.movies.tMovies.mapper;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.UsersDto;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.entity.UsersEntity;
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
public interface UsersMapper {

    UsersDto toDTO(UsersEntity entity);
    List<UsersDto> toDTOList(List<UsersEntity> entities);

    List<UsersEntity> fromDTOList(List<UsersDto> dtoList);

    UsersEntity fromDTO(UsersDto dto);
}
