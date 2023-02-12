package com.movies.tMovies.controller.admin;

import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.entity.UsersEntity;
import com.movies.tMovies.service.admin.AdminUserDetailDataServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminLoginController {

    private final AdminUserDetailDataServiceImpl adminUserDetailDataService;

    @GetMapping("/login")
    public String getAdminLogin(){
        return "page-login";
    }
    @GetMapping("/authenticate")
    public String getAdminMainLogin(Model model){
        UsersEntity usersEntity = new UsersEntity();
        model.addAttribute("userLogin",usersEntity);
        return "admin-main-page-login";
    }

    @PostMapping("/authenticate/order")
    public String saveAuthenticateDetails(@ModelAttribute("usersAccessDto") UsersAccessDto usersAccessDto){
        if(adminUserDetailDataService.verifyUserDetails(usersAccessDto)){
            return "redirect:/admin/panel";
        }
        else
            return "page-admin-error-403";

    }

}
