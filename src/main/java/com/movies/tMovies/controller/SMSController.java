package com.movies.tMovies.controller;

import com.movies.tMovies.dto.SMSPojo;
import com.movies.tMovies.dto.TempOTP;
import com.movies.tMovies.exception.NotFoundException;
import com.movies.tMovies.service.SMSService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequiredArgsConstructor
public class SMSController {

   private final SMSService service;

   private final SimpMessagingTemplate webSocket;

   private final String TOPIC_DESTINATION = "/lesson/sms";


   @PostMapping("/mobileNo")
    public ResponseEntity<Boolean> smsSubmit(@RequestBody SMSPojo number){
       try {
           System.out.println("Sending");
           service.send(number);
           System.out.println("send");
       }catch (Exception e){
           return new ResponseEntity<Boolean>(false,HttpStatus.INTERNAL_SERVER_ERROR);
       }
       webSocket.convertAndSend(TOPIC_DESTINATION,getTimeStamp() + ": SMS has been sent!:" + number);
//       return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        return new ResponseEntity<Boolean>(true,HttpStatus.OK);
   }


   private String getTimeStamp(){
       return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
   }

   @PostMapping("/sending")
    public void sendOTP(@RequestBody String data) throws ParseException {
   }

   @GetMapping("/verifection/number")
    public String getNumber(Model model){
       SMSPojo smsPojo = new SMSPojo();
       model.addAttribute("getNumber",smsPojo);
       return "otp";
   }

   @GetMapping("/send/otp")
    public String sendOTP(@ModelAttribute("smsPojo") SMSPojo smsPojo,Model model) throws ParseException {
       service.send(smsPojo);
       TempOTP tempOTP = new TempOTP();
       model.addAttribute("getOTP",tempOTP);
       return "otpverifection";
   }

   @PostMapping("/send1")
    public void senddating(@RequestBody SMSPojo smsPojo) throws ParseException {
       service.send(smsPojo);
       System.out.println("sending");
   }
}
