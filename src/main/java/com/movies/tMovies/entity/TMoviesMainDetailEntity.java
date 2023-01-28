package com.movies.tMovies.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "tmoviesmaindetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TMoviesMainDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String tMoviesLogo;

    private String tMoviesWord;

    private String tMoviesFooterBackground;

    private String tMoviesFooterHome;

    private String tMoviesFooterContact;

    private String tMoviesFooterService;

    private String tMoviesFooterAbout;

    private String tMoviesFooterLive;

    private String tMoviesFooterFaq;

    private String tMoviesFooterPremium;

    private String tMoviesFooterMustWatch;

    private String tMoviesFooterRelease;

    private String tMoviesFooterTopImdb;

    private String tvSeriesParalaxBackground;

    private String tvSeriesParalaxLuna;

    private String tvSeriesParalaxNub1;

    private String tvSeriesParalaxNube2;

    private String tvSeriesParalaxJet;

    private String tvSeriesParalaxIronman;

    private String moviesHeader;

}
