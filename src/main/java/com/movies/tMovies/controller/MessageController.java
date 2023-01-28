package com.movies.tMovies.controller;

import com.movies.tMovies.model.MessageModel;
import com.movies.tMovies.storage.UserStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MessageController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat/{to}")
    public void sendMessage(@DestinationVariable String to, MessageModel message){
        System.out.println("handling this message: " + message + " to" + to);
        boolean isExists = UserStorage.getInstance().getUsers().contains(to);
        if(isExists){
         simpMessagingTemplate.convertAndSend("/topic/messages/" + to, message);
        }
    }
    @GetMapping("/message")
    public String getMessageWeb(){
        return "card";
    }

    @GetMapping("/cheating")
    public String chatPage(){
        return "card";
    }
}
