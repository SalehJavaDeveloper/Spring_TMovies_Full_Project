package com.movies.tMovies.controller.tmovies;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.service.tmovies.HomePartInterfaceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tmovies")
public class TMoviesHomePart {
    private final HomePartInterfaceImpl homePartInterface;

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
}
