package com.movies.tMovies.controller.admin;

import com.movies.tMovies.service.admin.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminAppProfile {

    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    @GetMapping("/app-profile")
    public String getAppProfile(Model model){
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "app-profile";
    }
}
