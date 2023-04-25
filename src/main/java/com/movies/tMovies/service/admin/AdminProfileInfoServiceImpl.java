package com.movies.tMovies.service.admin;

import com.movies.tMovies.dto.AdminProfileInfoDto;
import com.movies.tMovies.entity.AdminProfileInfoEntity;

import java.util.List;

public interface AdminProfileInfoServiceImpl {

    AdminProfileInfoDto getAll();

    AdminProfileInfoDto saveAdminInfo(AdminProfileInfoEntity adminProfileInfoEntity);

    void deleteAdminInfo(Long id);

    AdminProfileInfoDto findAdminInfoById(Long id);
}
