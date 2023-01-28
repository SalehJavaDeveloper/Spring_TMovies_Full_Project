package com.movies.tMovies.controller;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.service.Impl.TMoviesMainDetailServiceImpl;
import com.movies.tMovies.service.Impl.TMovies_TvSeriesImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TMovies_TvSeriesController {
    private final TMovies_TvSeriesImpl tMovies_tvSeries;
    private final TMoviesMainDetailServiceImpl tMoviesMainDetailService;

    @GetMapping("/tvSeries")
    public String getDataByTvSeries(Model model){
        int uniqueId = 2;
        List<TMoviesMainDetailDto> tMoviesMainDetailDtos = tMoviesMainDetailService.getDataByMainDetailMovie();
        model.addAttribute("tvseriesdetaildata",tMoviesMainDetailDtos);
        List<TMoviesDTO> tMoviesDTOList = tMovies_tvSeries.getDataByTvSeries(uniqueId);
        model.addAttribute("tvSeriesData",tMoviesDTOList);
        return "tvseries";
    }
}
