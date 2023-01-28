package com.movies.tMovies.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CardInfoDto {

    private Long card_id;


    private String cardNumber;


    private String cardHolder;


    private String expirationMM;


    private String expirationYY;


    private String cardCVV;


    private int cashCard;

    private LocalDateTime send_Time;
}
