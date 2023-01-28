package com.movies.tMovies.controller;

import com.movies.tMovies.service.Impl.AdminProfileInfoServiceImpl;
import com.movies.tMovies.service.Impl.AdminTransactionServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdminTransactionController {

    private final AdminTransactionServiceImpl adminTransactionService;
    private final AdminProfileInfoServiceImpl adminProfileInfoService;

    @GetMapping("/admin/transaction")
    public String getAdminController(Model model){
        model.addAttribute("tranData",adminTransactionService.getAllTransaction());
        model.addAttribute("getAdminInfo",adminProfileInfoService.getAll());
        return "page-transaction";
    }

}
