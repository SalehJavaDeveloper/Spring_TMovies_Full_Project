package com.movies.tMovies.mapper;

import com.movies.tMovies.dto.ShopCardDto;
import com.movies.tMovies.dto.UsersDto;
import com.movies.tMovies.entity.ShopCardEntity;
import com.movies.tMovies.entity.UsersEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ShopCardMapper {
    ShopCardDto toDTO(ShopCardEntity entity);
    List<ShopCardDto> toDTOList(List<ShopCardEntity> entities);

    List<ShopCardEntity> fromDTOList(List<ShopCardDto> dtoList);

    ShopCardEntity fromDTO(ShopCardDto dto);
}
