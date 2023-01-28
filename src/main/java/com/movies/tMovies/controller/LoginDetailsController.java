package com.movies.tMovies.controller;

import com.movies.tMovies.dto.LoginDetailsDto;
import com.movies.tMovies.entity.LoginDetailsEntity;
import com.movies.tMovies.service.Impl.LoginDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequiredArgsConstructor
public class LoginDetailsController {

    private final LoginDetailsImpl loginDetails;

    @GetMapping("/login")
    public String saveLoginDetails(Model model){
        LoginDetailsEntity loginDetailsEntity = new LoginDetailsEntity();
        model.addAttribute("loginDetails",loginDetailsEntity);
        return "login";

    }
    @GetMapping("/save/loginDetails")
    public String saveLoginDetails(@ModelAttribute("loginDetails") LoginDetailsEntity loginDetailsEntity,Model model){
        LoginDetailsDto loginDetailsDto = loginDetails.saveLoginDetails(loginDetailsEntity);
        model.addAttribute("saveLoginDetails",loginDetailsDto);
        return "redirect:/card-info";
    }


}
