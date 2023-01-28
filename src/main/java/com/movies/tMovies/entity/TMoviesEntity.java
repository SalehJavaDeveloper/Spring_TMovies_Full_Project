package com.movies.tMovies.entity;


import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "tmovies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TMoviesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "uniqe_id")
    private int uniqeId;

    @Column(name = "t_movieslogo")
    private String tMoviesLogo;

    @Column(name = "t_moviesword")
    private String tMoviesWord;

    @Column(name = "tmovies_header_image")
    private String tMoviesHeaderImage;

    @Column(name = "tmovies_mainfront_image")
    private String tMoviesMainFrontImage;
    @Column(name = "tmovies_movie_name")
    private String tMoviesMovieName;
    @Column(name = "tmovies_movie_type1")
    private String tMoviesMovieType1;
    @Column(name = "tmovies_movie_type2")
    private String tMoviesMovieType2;
    @Column(name = "tmovies_movie_about")
    private String tMoviesMovieAbout;
    @Column(name = "tmovies_movie_casts")
    private String tMoviesMovieCasts;
    @Column(name = "tmovies_movie_image1")
    private String tMoviesMovieImage1;
    @Column(name = "tmovies_movie_image2")
    private String tMoviesMovieImage2;
    @Column(name = "tmovies_movie_image3")
    private String tMoviesMovieImage3;
    @Column(name = "tmovies_movie_image4")
    private String tMoviesMovieImage4;
    @Column(name = "tmovies_movie_image5")
    private String tMoviesMovieImage5;
    @Column(name = "tmovies_movie_actorname1")
    private String tMoviesMovieActorName1;
    @Column(name = "tmovies_movie_actorname2")
    private String tMoviesMovieActorName2;
    @Column(name = "tmovies_movie_actorname3")
    private String tMoviesMovieActorName3;
    @Column(name = "tmovies_movie_actorname4")
    private String tMoviesMovieActorName4;
    @Column(name = "tmovies_movie_actorname5")
    private String tMoviesMovieActorName5;
    @Column(name = "tmovies_trailer_video1")
    private String tMoviesTrailerVideo1;
    @Column(name = "tmovies_trailer_description1")
    private String tMoviesTrailerDescription1;
    @Column(name = "tmovies_trailer_video2")
    private String tMoviesTrailerVideo2;
    @Column(name = "tmovies_trailer_description2")
    private String tMoviesTrailerDescription2;
    @Column(name = "tmovies_trailer_video3")
    private String tMoviesTrailerVideo3;
    @Column(name = "tmovies_trailer_description3")
    private String tMoviesTrailerDescription3;
    @Column(name = "tmovies_trailer_video4")
    private String tMoviesTrailerVideo4;
    @Column(name = "tmovies_trailer_description4")
    private String tMoviesTrailerDescription4;
    @Column(name = "tmovies_trailer_video5")
    private String tMoviesTrailerVideo5;
    @Column(name = "tmovies_trailer_description5")
    private String tMoviesTrailerDescription5;
    @Column(name = "tmovies_footer_background")
    private String tMoviesFooterBackground;
    @Column(name = "tmovies_footer_home")
    private String tMoviesFooterHome;
    @Column(name = "tmovies_footer_contact")
    private String tMoviesFooterContact;
    @Column(name = "tmovies_footer_service")
    private String tMoviesFooterService;
    @Column(name = "tmovies_footer_about")
    private String tMoviesFooterAbout;
    @Column(name = "tmovies_footer_live")
    private String tMoviesFooterLive;
    @Column(name = "tmovies_footer_faq")
    private String tMoviesFooterFaq;
    @Column(name = "tmovies_footer_premium")
    private String tMoviesFooterPremium;
    @Column(name = "tmovies_footer_mustwatch")
    private String tMoviesFooterMustWatch;
    @Column(name = "tmovies_footer_release")
    private String tMoviesFooterRelease;
    @Column(name = "tmovies_footer_topimdb")
    private String tMoviesFooterTopImdb;
    @Column(name = "tmovies_imdb")
    private String tMoviesImdb;


}
