package com.movies.tMovies.controller.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.service.tmovies.TMoviesMainDetailServiceImpl;
import com.movies.tMovies.service.tmovies.TMoviesTvSeriesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tmovies")
public class TMoviesTvSeriesController {
    private final TMoviesTvSeriesImpl tMovies_tvSeries;
    private final TMoviesMainDetailServiceImpl tMoviesMainDetailService;

    @GetMapping("/tvSeries")
    public String getDataByTvSeries(Model model){
        List<TMoviesMainDetailDto> tMoviesMainDetailDtos = tMoviesMainDetailService.getDataByMainDetailMovie();
        model.addAttribute("tvseriesdetaildata",tMoviesMainDetailDtos);
        List<TMoviesDTO> tMoviesDTOList = tMovies_tvSeries.getDataByTvSeries("series");
        model.addAttribute("tvSeriesData",tMoviesDTOList);
        return "tvseries";
    }
}
