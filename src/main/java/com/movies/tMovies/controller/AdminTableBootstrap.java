package com.movies.tMovies.controller;

import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.mapper.TMoviesMapper;
import com.movies.tMovies.service.Impl.AdminProfileInfoServiceImpl;
import com.movies.tMovies.service.Impl.AdminTableTMoviesServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class AdminTableBootstrap {

    private final AdminTableTMoviesServiceImpl adminTableTMoviesService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    private final TMoviesMapper tMoviesMapper;

    @GetMapping("/admin/table/bootstrap")
    public String getAdminTable(Model model){
        model.addAttribute("getMovies",adminTableTMoviesService.getAllMovies());
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "table-bootstrap-basic";
    }

    @GetMapping("/create/tmovies-data")
    public String getnewDataMovies(Model model){
        TMoviesEntity tMoviesEntity = new TMoviesEntity();
        model.addAttribute("newDataMovies",tMoviesEntity);
        return "create-tmovies-data";
    }

    @GetMapping("/save/new-tmovies-data")
    public String saveTMoviesData(@ModelAttribute("tMoviesEntity")TMoviesEntity tMoviesEntity,Model model){
        TMoviesDTO tMoviesDTO = adminTableTMoviesService.saveNewData(tMoviesEntity);
        model.addAttribute("saveData",tMoviesDTO);
        return "redirect:/admin/table/bootstrap";
    }

    @GetMapping("/delete/by/{id}")
    public String deleteById(@PathVariable("id") Long id){
        adminTableTMoviesService.deleteMovieById(id);
        return "redirect:/admin/table/bootstrap";
    }

    @GetMapping("/movie/edit/{id}")
    public String editMovieById(@PathVariable("id") Long id, Model model){
     model.addAttribute("editById",adminTableTMoviesService.findById(id));
     return "edit-tmovies-data";
    }

    @GetMapping("/movie/editing/by/{id}")
    public String editMainMovie(@PathVariable("id")Long id,
                                @ModelAttribute("tMoviesEntity")TMoviesEntity tMoviesEntity){
    TMoviesDTO tMoviesDTO = adminTableTMoviesService.findById(id);
        TMoviesEntity moviesEntity = tMoviesMapper.fromDTO(tMoviesDTO);
        moviesEntity.setId(id);
        moviesEntity.setUniqeId(tMoviesEntity.getUniqeId());
        moviesEntity.setTMoviesLogo(tMoviesEntity.getTMoviesLogo());
        moviesEntity.setTMoviesWord(tMoviesEntity.getTMoviesWord());
        moviesEntity.setTMoviesHeaderImage(tMoviesEntity.getTMoviesHeaderImage());
        moviesEntity.setTMoviesMainFrontImage(tMoviesEntity.getTMoviesMainFrontImage());
        moviesEntity.setTMoviesMovieName(tMoviesEntity.getTMoviesMovieName());
        moviesEntity.setTMoviesMovieType1(tMoviesEntity.getTMoviesMovieType1());
        moviesEntity.setTMoviesMovieType2(tMoviesEntity.getTMoviesMovieType2());
        moviesEntity.setTMoviesMovieAbout(tMoviesEntity.getTMoviesMovieAbout());
        moviesEntity.setTMoviesMovieCasts(tMoviesEntity.getTMoviesMovieCasts());
        moviesEntity.setTMoviesMovieImage1(tMoviesEntity.getTMoviesMovieImage1());
        moviesEntity.setTMoviesMovieImage2(tMoviesEntity.getTMoviesMovieImage2());
        moviesEntity.setTMoviesMovieImage3(tMoviesEntity.getTMoviesMovieImage3());
        moviesEntity.setTMoviesMovieImage4(tMoviesEntity.getTMoviesMovieImage4());
        moviesEntity.setTMoviesMovieImage5(tMoviesEntity.getTMoviesMovieImage5());
        moviesEntity.setTMoviesMovieActorName1(tMoviesEntity.getTMoviesMovieActorName1());
        moviesEntity.setTMoviesMovieActorName2(tMoviesEntity.getTMoviesMovieActorName2());
        moviesEntity.setTMoviesMovieActorName3(tMoviesEntity.getTMoviesMovieActorName3());
        moviesEntity.setTMoviesMovieActorName4(tMoviesEntity.getTMoviesMovieActorName4());
        moviesEntity.setTMoviesMovieActorName5(tMoviesEntity.getTMoviesMovieActorName5());
        moviesEntity.setTMoviesTrailerDescription1(tMoviesEntity.getTMoviesTrailerDescription1());
        moviesEntity.setTMoviesTrailerVideo1(tMoviesEntity.getTMoviesTrailerVideo1());
        moviesEntity.setTMoviesTrailerDescription2(tMoviesEntity.getTMoviesTrailerDescription2());
        moviesEntity.setTMoviesTrailerVideo2(tMoviesEntity.getTMoviesTrailerVideo2());
        moviesEntity.setTMoviesTrailerDescription3(tMoviesEntity.getTMoviesTrailerDescription3());
        moviesEntity.setTMoviesTrailerVideo3(tMoviesEntity.getTMoviesTrailerVideo3());
        moviesEntity.setTMoviesTrailerDescription4(tMoviesEntity.getTMoviesTrailerDescription4());
        moviesEntity.setTMoviesTrailerVideo4(tMoviesEntity.getTMoviesTrailerVideo4());
        moviesEntity.setTMoviesTrailerDescription5(tMoviesEntity.getTMoviesTrailerDescription5());
        moviesEntity.setTMoviesTrailerVideo5(tMoviesEntity.getTMoviesTrailerVideo5());
        moviesEntity.setTMoviesFooterBackground(tMoviesEntity.getTMoviesFooterBackground());
        moviesEntity.setTMoviesFooterHome(tMoviesEntity.getTMoviesFooterHome());
        moviesEntity.setTMoviesFooterContact(tMoviesEntity.getTMoviesFooterContact());
        moviesEntity.setTMoviesFooterService(tMoviesEntity.getTMoviesFooterService());
        moviesEntity.setTMoviesFooterAbout(tMoviesEntity.getTMoviesFooterAbout());
        moviesEntity.setTMoviesFooterLive(tMoviesEntity.getTMoviesFooterLive());
        moviesEntity.setTMoviesFooterFaq(tMoviesEntity.getTMoviesFooterFaq());
        moviesEntity.setTMoviesFooterPremium(tMoviesEntity.getTMoviesFooterPremium());
        moviesEntity.setTMoviesFooterMustWatch(tMoviesEntity.getTMoviesFooterMustWatch());
        moviesEntity.setTMoviesFooterRelease(tMoviesEntity.getTMoviesFooterRelease());
        moviesEntity.setTMoviesFooterTopImdb(tMoviesEntity.getTMoviesFooterTopImdb());
        moviesEntity.setTMoviesImdb(tMoviesEntity.getTMoviesImdb());
          adminTableTMoviesService.saveNewData(moviesEntity);
        return "redirect:/admin/table/bootstrap";
    }

}
