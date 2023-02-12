package com.movies.tMovies.controller.admin;

import com.movies.tMovies.dto.UsersDto;
import com.movies.tMovies.entity.UsersEntity;
import com.movies.tMovies.mapper.UsersMapper;
import com.movies.tMovies.service.admin.AdminProfileInfoServiceImpl;
import com.movies.tMovies.service.admin.AdminUserDetailDataServiceImpl;
import com.movies.tMovies.service.impl.tmovies.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminUserDetailDataController {

    private final AdminUserDetailDataServiceImpl adminUserDetailDataService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;


    @GetMapping("/user/details/data")
    public String getUserData(Model model){
        model.addAttribute("userData",adminUserDetailDataService.getAllUsers());
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "AdminUserDetails";
    }
    @GetMapping("/create/users-data")
    public String createNewUsers(Model model){
        UsersEntity usersEntity = new UsersEntity();
        model.addAttribute("usersNewData",usersEntity);
        return "create-userdetails-data";
    }
    @PostMapping("/save/users-data")
    public String saveUsersData(@ModelAttribute("usersEntity")UsersEntity usersEntity, Model model){
        boolean check = adminUserDetailDataService.saveUser(usersEntity);
        if (check){
            return "redirect:/admin/user/details/data";
        }else {
            return "login-admin-table-error-400";
        }

    }
    @GetMapping("/delete/users/by/{id}")
    public String deleteUsersById(@PathVariable("id") Integer id){
        adminUserDetailDataService.deleteUserById(id);
        return "redirect:/admin/user/details/data";
    }
    @GetMapping("/users/edit/{id}")
    public String editMovieById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("editUsersById",adminUserDetailDataService.findUserById(id));
        return "edit-userdetails-data";
    }
    @PostMapping("/users/editing/by/{id}")
    public String editMainUsers(@PathVariable("id")Integer id,
                                @ModelAttribute("tMoviesEntity")UsersEntity usersEntity) {
        boolean savemain = adminUserDetailDataService.savemain(id, usersEntity);
        if (savemain){
            return "redirect:/admin/user/details/data";
        }
        else {
            return "login-admin-table-error-400";
        }

    }
}
