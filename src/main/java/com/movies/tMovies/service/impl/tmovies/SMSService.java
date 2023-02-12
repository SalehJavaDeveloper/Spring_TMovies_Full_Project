package com.movies.tMovies.service.impl.tmovies;

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
    private final String AUTH_TOKEN = "4741b68e008e3d0638c97afe0f9af100";
    private final String FROM_NUMBER = "+12056289555";

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
//fcbYKHKpq7E04BeH1MNK-OgIzpFU-8tcBwSfUZY9