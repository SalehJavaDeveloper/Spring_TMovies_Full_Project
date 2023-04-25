package com.movies.tMovies.service.impl.admin;

import com.movies.tMovies.dto.AdminProfileInfoDto;
import com.movies.tMovies.entity.AdminProfileInfoEntity;
import com.movies.tMovies.mapper.AdminProfileInfoMapper;
import com.movies.tMovies.repository.AdminProfileInfoTableRepository;
import com.movies.tMovies.service.admin.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminProfileInfoService implements AdminProfileInfoServiceImpl {

    private final AdminProfileInfoTableRepository adminProfileInfoRepository;
    private final AdminProfileInfoMapper adminProfileInfoMapper;

    @Override
    public AdminProfileInfoDto getAll() {
        AdminProfileInfoEntity entityList = adminProfileInfoRepository.getAllData();
        return adminProfileInfoMapper.toDTO(entityList);
    }

    @Override
    public AdminProfileInfoDto saveAdminInfo(AdminProfileInfoEntity adminProfileInfoEntity2) {
        AdminProfileInfoEntity adminProfileInfoEntity1 = adminProfileInfoRepository.save(adminProfileInfoEntity2);
        return adminProfileInfoMapper.toDTO(adminProfileInfoEntity1);
    }

    @Override
    public void deleteAdminInfo(Long id) {
      adminProfileInfoRepository.deleteById(id);
    }

    @Override
    public AdminProfileInfoDto findAdminInfoById(Long id) {
        AdminProfileInfoEntity adminProfileInfoEntity = adminProfileInfoRepository.findById(id).get();
        return adminProfileInfoMapper.toDTO(adminProfileInfoEntity);
    }
}
