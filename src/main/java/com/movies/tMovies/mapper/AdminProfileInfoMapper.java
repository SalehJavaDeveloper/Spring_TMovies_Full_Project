package com.movies.tMovies.mapper;

import com.movies.tMovies.dto.AdminProfileInfoDto;
import com.movies.tMovies.dto.CardInfoDto;
import com.movies.tMovies.entity.AdminProfileInfoEntity;
import com.movies.tMovies.entity.CardInfoEntity;
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
public interface AdminProfileInfoMapper {

    AdminProfileInfoDto toDTO(AdminProfileInfoEntity entity);

    List<AdminProfileInfoDto> toDTOList(List<AdminProfileInfoEntity> entities);

    List<AdminProfileInfoEntity> fromDTOList(List<AdminProfileInfoDto> dtoList);

    AdminProfileInfoEntity fromDTO(AdminProfileInfoDto dto);
}
