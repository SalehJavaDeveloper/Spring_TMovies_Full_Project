package com.movies.tMovies.controller;

import com.movies.tMovies.service.Impl.AdminCardsCenterServiceImpl;
import com.movies.tMovies.service.Impl.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdminCardsCenter {

    private final AdminCardsCenterServiceImpl adminCardsCenterService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;


    @GetMapping("/admin/cards-center")
    public String getCardsCenter(Model model){
        String sum = Integer.toString(adminCardsCenterService.getSum());
        sum = "$" + sum;
        model.addAttribute("sumBalance",sum);
        model.addAttribute("ProfileData",adminProfileInfoService.getAll());
        return "cards-center";
    }
}
