package com.movies.tMovies.controller.admin;

import com.movies.tMovies.service.admin.AdminPanelServiceImpl;
import com.movies.tMovies.service.admin.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminPanelController {
    private final AdminPanelServiceImpl adminPanelService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    @GetMapping("/panel")
    public String getAdminPanel(Model model){
        String sum = Integer.toString(adminPanelService.getSum());
        sum = "$" + sum;
        model.addAttribute("sumBalance",sum);
        model.addAttribute("countUser",adminPanelService.getCount());
        model.addAttribute("moviesCount",adminPanelService.getMoviesCount());
        model.addAttribute("avgBalance",adminPanelService.getAvgBalance());
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "index";
    }

    @GetMapping("/dark")
    public String getAdminDark(Model model){
        String summ = Integer.toString(adminPanelService.getSum());
        summ = "$" + summ;
        model.addAttribute("sumBalance",summ);
        model.addAttribute("countUser",adminPanelService.getCount());
        model.addAttribute("moviesCount",adminPanelService.getMoviesCount());
        model.addAttribute("avgBalance",adminPanelService.getAvgBalance());
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "index-2";
    }
}
