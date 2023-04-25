package com.movies.tMovies.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "shoppingcard")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShopCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "t_movies_main_front_image")
    private String tMoviesMainFrontImage;

    @Column(name = "t_movies_movie_name")
    private String TMoviesMovieName;

    private String tMoviesImdb;

    private Long movieId;
}
