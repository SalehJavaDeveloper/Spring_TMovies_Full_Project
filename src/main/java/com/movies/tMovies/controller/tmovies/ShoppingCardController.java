package com.movies.tMovies.controller.tmovies;

import com.movies.tMovies.dto.ShopCardDto;
import com.movies.tMovies.dto.TMoviesDTO;
import com.movies.tMovies.entity.ShopCardEntity;
import com.movies.tMovies.service.tmovies.ShoppingCardServiceImpl;
import com.movies.tMovies.service.tmovies.TMoviesMainPageServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tmovies")
public class ShoppingCardController {

    private final ShoppingCardServiceImpl shoppingCardService;
    private final TMoviesMainPageServiceImpl tMoviesMainPageService;

    @GetMapping("/shop/card/data")
    public String getAllData(Model model){
        List<ShopCardDto> shopCardDtos = shoppingCardService.getAllMovies();
        model.addAttribute("shopCardData",shopCardDtos);
        System.out.println(shopCardDtos);
        return "home";
    }
    @GetMapping("/shop-card/data-id/{id}")
    public String getShopDataById(@PathVariable("id") Long id,Model model){
        TMoviesDTO tMoviesDTO = tMoviesMainPageService.getMovieById(id);
        ShopCardEntity shopCardEntity = new ShopCardEntity();
        if(shoppingCardService.findByMovieName(tMoviesDTO.getTMoviesMovieName())){
            shopCardEntity.setTMoviesMainFrontImage(tMoviesDTO.getTMoviesMainFrontImage());
            shopCardEntity.setTMoviesMovieName(tMoviesDTO.getTMoviesMovieName());
            shopCardEntity.setTMoviesImdb(tMoviesDTO.getTMoviesImdb());
            shopCardEntity.setMovieId(tMoviesDTO.getId());
            shoppingCardService.saveShopCardMovies(shopCardEntity);
        }
        return "redirect:/tmovies/sort/pagable";
    }


    @GetMapping("/delete/shop-data/{id}")
    public String deleteShopData(@PathVariable("id") Long id){
        shoppingCardService.deleteShopCardMovie(id);
        return "redirect:/tmovies/sort/pagable";
    }

    @GetMapping("/delete/all/shop-data")
    public void deleteAllShopData(){
        shoppingCardService.deleteAllShopCardMovies();
    }
}
