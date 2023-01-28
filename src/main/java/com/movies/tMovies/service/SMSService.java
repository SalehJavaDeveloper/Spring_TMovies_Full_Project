package com.movies.tMovies.service;

import com.movies.tMovies.dto.SMSPojo;
import com.movies.tMovies.dto.StoreOTP;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class SMSService {

    private final  String ACCOUNT_SID = "ACc78b969f69d2fb1c29227b3878357813";
    private final String AUTH_TOKEN = "49833bb568a031fe9ffb87c6c85525f9";
    private final String FROM_NUMBER = "+12056289555";

//ACf77680183b8099e90e2c58a37c07c41a
//    002999532e70ba3760c06f642e1dbf30
//    +15089388270
    public void send(SMSPojo sms) throws ParseException {

        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
         int number = getOTP();

        String msg = "Your OTP - " + number + " please verify this OTP in your Application TMovies";
            PhoneNumber to = new PhoneNumber(sms.getPhoneNo());

            PhoneNumber from = new PhoneNumber(FROM_NUMBER);
            
            Message message = Message.creator(to,from,msg).create();

            StoreOTP.setOtp(number);
    }
    public int getOTP(){
        int min = 100000;
        int max = 999999;
        int number = (int)(Math.random()*(max-min+1)+min);
        return number;
    }
}
