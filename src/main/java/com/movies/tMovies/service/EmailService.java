package com.movies.tMovies.service;

import com.movies.tMovies.dto.EmailRequestDto;
import com.sendgrid.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class EmailService{



    @Value("${sendgrid.key}")
    private String key;

    @Autowired
    SendGrid sg;

    public Response sendEmail(EmailRequestDto emailRequestDto) throws IOException {
        Email from = new Email("sallahverdiyev2@std.beu.edu.az");
        String subject = "Tmovies Application";
        Email to = new Email(emailRequestDto.getTo());
        Content content = new Content("text/html", getSubject());
        Mail mail = new Mail(from, subject, to, content);

            Request request = new Request();

            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        return response;
    }

    public String getSubject(){
        String body = "<html><head></head><body>Welcome to TMovies. We hope you will enjoy our site. <a href=\"http://localhost:9095/payment/information\">Click to login</a></body></html>";
        return body;
    }
}
