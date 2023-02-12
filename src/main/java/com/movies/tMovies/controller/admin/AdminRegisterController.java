package com.movies.tMovies.controller.admin;

import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.service.admin.AdminRegisterServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminRegisterController {
    private final AdminRegisterServiceImpl adminRegisterService;

    @GetMapping("/register")
    public String getAdminRegister(Model model){
        UsersAccessDto usersAccessDto = new UsersAccessDto();
        model.addAttribute("adminregister",usersAccessDto);
        return "register-admin";
    }

    @PostMapping("/register/details")
    public String saveAdminRegisterDetails(@ModelAttribute("usersAccessDto") UsersAccessDto usersAccessDto){
        boolean check = adminRegisterService.save(usersAccessDto);
        if (check){
            return "redirect:/admin/panel";
        }else
            return "login-admin-error-400";

    }
}
