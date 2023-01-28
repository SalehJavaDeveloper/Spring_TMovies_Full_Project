package com.movies.tMovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminLoginController {

    @GetMapping("/admin/login")
    public String getAdminLogin(){
        return "page-login";
    }
}
