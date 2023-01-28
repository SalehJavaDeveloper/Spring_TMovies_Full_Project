package com.movies.tMovies.controller;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.service.Impl.HomePartInterfaceImpl;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TMoviesHomePart {
    private final HomePartInterfaceImpl homePartInterface;

  //  @GetMapping("/homepart")
  @RequestMapping(value = "/infoMovies/{id}",
          method = RequestMethod.GET,
          produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public String getAllDataAboutMovies(@PathVariable("id") Long id, Model model){
        List<TMoviesDTO> dtoList = homePartInterface.getAllAboutData();
        TMoviesDTO tMoviesDTO = homePartInterface.getStudentById(id);
        model.addAttribute("mymaindata",tMoviesDTO);
        model.addAttribute("alldatamovies",dtoList);
        return "homepart";
    }
//    @RequestMapping(value = "/infoMovies/{id}",
//            method = RequestMethod.GET,
//            produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
//    public String getDataByMainPages(@PathVariable("id") Long id, Model model){
//
//        TMoviesDTO tMoviesDTO = homePartInterface.getStudentById(id);
//        model.addAttribute("mymaindata",tMoviesDTO);
//        return "redirect:/homepart";
//    }
}
