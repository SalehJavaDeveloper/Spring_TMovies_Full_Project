package com.movies.tMovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminRegisterController {

    @GetMapping("/admin/register")
    public String getAdminRegister(){
        return "page-register";
    }
}
