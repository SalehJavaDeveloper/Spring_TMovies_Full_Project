package com.movies.tMovies.controller;

import com.movies.tMovies.service.Impl.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdminAppProfile {

    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    @GetMapping("/admin/app-profile")
    public String getAppProfile(Model model){
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "app-profile";
    }
}
