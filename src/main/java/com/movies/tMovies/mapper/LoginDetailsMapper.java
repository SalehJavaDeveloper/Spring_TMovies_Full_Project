package com.movies.tMovies.mapper;

import com.movies.tMovies.dto.CardInfoDto;
import com.movies.tMovies.dto.LoginDetailsDto;
import com.movies.tMovies.entity.CardInfoEntity;
import com.movies.tMovies.entity.LoginDetailsEntity;
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
public interface LoginDetailsMapper {
    LoginDetailsDto toDTO(LoginDetailsEntity productEntity);

    List<LoginDetailsDto> toDTOList(List<LoginDetailsEntity> entities);

    List<LoginDetailsEntity> fromDTOList(List<LoginDetailsDto> dtoList);

    LoginDetailsEntity fromDTO(LoginDetailsDto dto);
}
