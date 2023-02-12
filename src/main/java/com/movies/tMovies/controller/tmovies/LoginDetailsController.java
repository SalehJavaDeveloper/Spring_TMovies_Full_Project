package com.movies.tMovies.controller.tmovies;


import com.movies.tMovies.dto.UsersAccessDto;
import com.movies.tMovies.service.tmovies.ShoppingCardServiceImpl;
import com.movies.tMovies.service.tmovies.UsersServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tmovies")
public class LoginDetailsController {

 private final UsersServiceImpl usersService;
 private final ShoppingCardServiceImpl shoppingCardService;

    @GetMapping("/login")
    public String saveLoginDetails(Model model){
        UsersAccessDto usersAccessDto = new UsersAccessDto();
        model.addAttribute("loginDetails",usersAccessDto);
        return "registerlogin";
    }

    @PostMapping("/save/loginDetails")
    public String saveLoginDetails(@ModelAttribute("usersAccessDto") UsersAccessDto usersAccessDto){
        boolean check = usersService.save(usersAccessDto);
        if(check){
            shoppingCardService.deleteAllShopCardMovies();
            return "redirect:/tmovies/sort/pagable";
        }
        else {
            return "login-error-400";
        }
    }

    @GetMapping("/authenticate")
    public String authenticateLoginDetails(Model model){
        UsersAccessDto usersAccessDto = new UsersAccessDto();
        model.addAttribute("authenticate",usersAccessDto);
        return "login";
    }

    @PostMapping ("/save/authenticate/details")
    public String saveAuthenticateDetails(@ModelAttribute("usersAccessDto") UsersAccessDto usersAccessDto){
        if(usersService.verifyUserDetails(usersAccessDto)){
            return "redirect:/tmovies/sort/pagable";
        }
        else
            return "page-error-401";

    }
}
