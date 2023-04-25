package com.movies.tMovies.controller.admin;

import com.movies.tMovies.service.admin.AdminProfileInfoServiceImpl;

import com.movies.tMovies.service.admin.AdminTransactionServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminTransactionController {

    private final AdminTransactionServiceImpl adminTransactionService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    @GetMapping("/transaction")
    public String getAdminController(Model model){
        model.addAttribute("tranData",adminTransactionService.getAllTransaction());
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "page-transaction";
    }

}
