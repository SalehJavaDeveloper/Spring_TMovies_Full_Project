package com.movies.tMovies.controller.admin;

import com.movies.tMovies.service.admin.AdminCardsCenterServiceImpl;
import com.movies.tMovies.service.admin.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminCardsCenter {

    private final AdminCardsCenterServiceImpl adminCardsCenterService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;


    @GetMapping("/cards-center")
    public String getCardsCenter(Model model){
        String sum = Integer.toString(adminCardsCenterService.getSum());
        sum = "$" + sum;
        model.addAttribute("sumBalance",sum);
        model.addAttribute("ProfileData",adminProfileInfoService.getAll());
        return "cards-center";
    }
}
