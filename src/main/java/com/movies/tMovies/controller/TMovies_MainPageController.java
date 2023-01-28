package com.movies.tMovies.controller;

import com.movies.tMovies.service.Impl.TMovies_MainPageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class TMovies_MainPageController {

    private final TMovies_MainPageServiceImpl tMovies_mainPageService;

    @GetMapping("/tmovies/Movies/{id}")
    public String getDataByMainPages(@PathVariable("id") Long id, Model model) {
        model.addAttribute("mainPageData", tMovies_mainPageService.getStudentById(id));
        model.addAttribute("getAllMovies",tMovies_mainPageService.findAllData());
        return "mainMoviePages";
    }
//    @GetMapping("/getAllMovies")
//    public String getAllMovies(Model model){
//
//        return "redirect:/tmovies/Movies/{id}";
//    }
}
