package com.movies.tMovies.controller.tmovies;

import com.movies.tMovies.service.tmovies.TMoviesMainPageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tmovies")
public class TMoviesMainPageController {

    private final TMoviesMainPageServiceImpl tMovies_mainPageService;

    @GetMapping("/Movies/{id}")
    public String getDataByMainPages(@PathVariable("id") Long id, Model model) {
        model.addAttribute("mainPageData", tMovies_mainPageService.getMovieById(id));
        model.addAttribute("getAllMovies",tMovies_mainPageService.findAllData());
        return "mainMoviePages";
    }
}
