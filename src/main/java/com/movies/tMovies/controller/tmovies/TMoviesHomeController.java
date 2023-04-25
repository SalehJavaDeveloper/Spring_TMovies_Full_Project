package com.movies.tMovies.controller.tmovies;

import com.movies.tMovies.dto.ShopCardDto;
import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.dto.TMoviesMainDetailDto;
import com.movies.tMovies.entity.TMoviesEntity;
import com.movies.tMovies.service.tmovies.ShoppingCardServiceImpl;
import com.movies.tMovies.service.tmovies.TMoviesHomeServiceImpl;
import com.movies.tMovies.service.tmovies.TMoviesMainDetailServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tmovies")
public class TMoviesHomeController {

    private final TMoviesHomeServiceImpl tMoviesHomeService;
    private final TMoviesMainDetailServiceImpl tMoviesMainDetailService;
    private final ShoppingCardServiceImpl shoppingCardService;

    @GetMapping("/sort/pagable")
    public String getDataByPagination(Model model) {
        Pageable firstPaginationPage = PageRequest.of(0, 20);
        Pageable secondPaginationPage = PageRequest.of(1, 20);
        Pageable thirdPaginationPage = PageRequest.of(2, 20);
        Pageable fourtyPaginationPage = PageRequest.of(3, 16);
        List<ShopCardDto> shopCardDtos = shoppingCardService.getAllMovies();
        List<TMoviesDTO> firstPagableData1 = tMoviesHomeService.findAllPagableData(firstPaginationPage);
        List<TMoviesDTO> firstPagableData2 = tMoviesHomeService.findAllPagableData(secondPaginationPage);
        List<TMoviesDTO> firstPagableData3 = tMoviesHomeService.findAllPagableData(thirdPaginationPage);
        List<TMoviesDTO> firstPagableData4 = tMoviesHomeService.findAllPagableData(fourtyPaginationPage);
        List<TMoviesMainDetailDto> tMoviesMainDetailDtos = tMoviesMainDetailService.getDataByMainDetailMovie();
        TMoviesDTO moviesDTO1 = tMoviesHomeService.findAllById(10L);
        TMoviesDTO moviesDTO2 = tMoviesHomeService.findAllById(21L);
        TMoviesDTO moviesDTO3 = tMoviesHomeService.findAllById(29L);
        model.addAttribute("headerhomedata1", moviesDTO1);
        model.addAttribute("headerhomedata2", moviesDTO2);
        model.addAttribute("headerhomedata3", moviesDTO3);
        model.addAttribute("maindetaildata", tMoviesMainDetailDtos);
        model.addAttribute("pagabledata1", firstPagableData1);
        model.addAttribute("pagabledata2", firstPagableData2);
        model.addAttribute("pagabledata3", firstPagableData3);
        model.addAttribute("pagabledata4", firstPagableData4);
        model.addAttribute("shopCardData",shopCardDtos);
        return "home";
    }

    @GetMapping("/finBy/pagable")
    public List<TMoviesDTO> findByPagable(@PathVariable Pageable pageable) {
        return tMoviesHomeService.findAllPagableData(pageable);
    }

    @GetMapping("/comment/chatting")
    public String message(){
        return "message";
    }

    @GetMapping("/save/movies")
    public TMoviesDTO saveMovies(@RequestBody TMoviesEntity tMoviesEntity){
        return tMoviesHomeService.saveMovies(tMoviesEntity);
    }
    @GetMapping("/delete/movies")
    public void deleteMovies(@PathVariable("id") Long id){
         tMoviesHomeService.deleteById(id);
    }
}
