package com.movies.tMovies.controller.tmovies;


import com.movies.tMovies.dto.StoreOTP;
import com.movies.tMovies.dto.TempOTP;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/tmovies")
public class VerifyOTPController {

    @GetMapping("/verify/otp")
    public String sendOTP(@ModelAttribute("tempOTP") TempOTP tempOTP){
        if(tempOTP.getOtp() == StoreOTP.getOtp())
            return "redirect:/tmovies/payment/information";
        else
            return "page-error-401";
    }
}
