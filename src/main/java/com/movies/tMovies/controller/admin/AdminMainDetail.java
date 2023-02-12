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
public class AdminMainDetail {

    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    @GetMapping("/email-compose")
    public String getEmailCompose(Model model){
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "email-compose";
    }

    @GetMapping("/empty-page")
    public String getEmptyPage(Model model){
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "empty-page";
    }

    @GetMapping("/400")
    public String getError1(){
        return "page-error-400";
    }
    @GetMapping("/403")
    public String getError2()
    {
        return "page-error-403";
    }

    @GetMapping("/404")
    public String getError3(){
        return "Number-404";
    }

    @GetMapping("/500")
    public String getError4(){
        return "page-error-500";
    }
    @GetMapping("/503")
    public String getError5(){
        return "page-error-503";
    }
    @GetMapping("/lock-screen")
    public String getLockScreen(){
        return "page-lock-screen";
    }



}
