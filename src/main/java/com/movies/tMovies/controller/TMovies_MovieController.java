package com.movies.tMovies.controller;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.service.Impl.TMoviesMainDetailServiceImpl;
import com.movies.tMovies.service.Impl.TMovies_MovieServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TMovies_MovieController {
    private final TMovies_MovieServiceImpl tMoviesService;
    private final TMoviesMainDetailServiceImpl tMoviesMainDetailService;

    @GetMapping("/movies")
    public String getAllData( Model model){
        int uniqeId = 1;
        List<TMoviesDTO> movies = tMoviesService.findByUniqeId(uniqeId);
        List<TMoviesMainDetailDto> tMoviesMainDetailDtos = tMoviesMainDetailService.getDataByMainDetailMovie();
        model.addAttribute("detailData",tMoviesMainDetailDtos);
        model.addAttribute("movies",movies);
        return "movie";
    }


}
