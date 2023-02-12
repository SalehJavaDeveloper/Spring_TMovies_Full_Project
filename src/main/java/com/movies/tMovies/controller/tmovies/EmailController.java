package com.movies.tMovies.controller.tmovies;

import com.movies.tMovies.dto.EmailRequestDto;
import com.movies.tMovies.service.impl.tmovies.EmailService;
import com.sendgrid.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("tmovies")
public class EmailController {

    private final EmailService emailService;
    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(EmailRequestDto emailRequestDto) throws IOException {

         Response response = emailService.sendEmail(emailRequestDto);

         if(response.getStatusCode() == 200 && response.getStatusCode() == 202)
             return new ResponseEntity<>("Send Successfully", HttpStatus.OK);
        else
            return new ResponseEntity<>("Send Successfully", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/send/email")
    public String getEmailPage(Model model){
        EmailRequestDto emailRequestDto = new EmailRequestDto();
        model.addAttribute("emailTo",emailRequestDto);
        return "email";
    }

    @PostMapping("/take/email")
    public String sendMainEmail(@ModelAttribute("emailRequestDto") EmailRequestDto emailRequestDto) throws IOException {
//        sendEmail(emailRequestDto);
        emailService.sendEmail(emailRequestDto);
        return "email-200";
    }
}
