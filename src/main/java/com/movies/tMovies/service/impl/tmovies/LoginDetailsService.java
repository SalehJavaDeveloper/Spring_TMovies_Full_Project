package com.movies.tMovies.service.impl.tmovies;

import com.movies.tMovies.dto.LoginDetailsDto;
import com.movies.tMovies.entity.LoginDetailsEntity;
import com.movies.tMovies.mapper.LoginDetailsMapper;
import com.movies.tMovies.repository.LoginDetailsRepository;
import com.movies.tMovies.service.tmovies.LoginDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginDetailsService implements LoginDetailsImpl {
    private final LoginDetailsRepository loginDetailsRepository;
    private final LoginDetailsMapper loginDetailsMapper;


    @Override
    public LoginDetailsDto saveLoginDetails(LoginDetailsEntity loginDetailsEntity) {
        LoginDetailsEntity detailsEntity = loginDetailsRepository.save(loginDetailsEntity);
        return loginDetailsMapper.toDTO(detailsEntity);
    }

}
