package com.movies.tMovies.controller.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.service.tmovies.TMoviesMainDetailServiceImpl;
import com.movies.tMovies.service.tmovies.TMoviesMovieServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tmovies")
public class TMoviesMovieController {
    private final TMoviesMovieServiceImpl tMoviesService;
    private final TMoviesMainDetailServiceImpl tMoviesMainDetailService;

    @GetMapping("/movies")
    public String getAllData( Model model){
        List<TMoviesDTO> movies = tMoviesService.findByMovieType("movie");
        List<TMoviesMainDetailDto> tMoviesMainDetailDtos = tMoviesMainDetailService.getDataByMainDetailMovie();
        model.addAttribute("detailData",tMoviesMainDetailDtos);
        model.addAttribute("movies",movies);
        return "movie";
    }


}
