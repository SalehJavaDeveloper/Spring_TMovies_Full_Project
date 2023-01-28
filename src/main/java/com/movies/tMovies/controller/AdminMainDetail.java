package com.movies.tMovies.controller;

import com.movies.tMovies.service.Impl.AdminProfileInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdminMainDetail {

    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    @GetMapping("/admin/email-compose")
    public String getEmailCompose(Model model){
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "email-compose";
    }

    @GetMapping("/admin/empty-page")
    public String getEmptyPage(Model model){
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "empty-page";
    }

    @GetMapping("/admin/400")
    public String getError1(){
        return "page-error-400";
    }
    @GetMapping("/admin/403")
    public String getError2()
    {
        return "page-error-403";
    }

    @GetMapping("/admin/404")
    public String getError3(){
        return "Number-404";
    }

    @GetMapping("/admin/500")
    public String getError4(){
        return "page-error-500";
    }
    @GetMapping("/admin/503")
    public String getError5(){
        return "page-error-503";
    }
    @GetMapping("/admin/lock-screen")
    public String getLockScreen(){
        return "page-lock-screen";
    }


    @GetMapping("/payment/information")
    public String getSubstraction(){
        return "criteria";
    }
}
