package com.movies.tMovies.controller;


import com.movies.tMovies.dto.StoreOTP;
import com.movies.tMovies.dto.TempOTP;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class VerifyOTPController {

    @GetMapping("/verify/otp")
    public String sendOTP(@ModelAttribute("tempOTP") TempOTP tempOTP){
        if(tempOTP.getOtp() == StoreOTP.getOtp())
            return "redirect:/payment/information";
        else
            return "page-error-401";
    }
}
