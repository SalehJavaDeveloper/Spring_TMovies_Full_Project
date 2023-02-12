package com.movies.tMovies.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCardDto {
    private  Long id;

    private String tMoviesMainFrontImage;
    private String tMoviesMovieName;
    private String tMoviesImdb;
    private Long movieId;
}
