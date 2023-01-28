package com.movies.tMovies.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "cardtransaction")
public class CardInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long card_id;

    private String cardNumber;

    private String cardHolder;

    @Column(name = "expiration_mm")
    private String expirationMM;
    @Column(name = "expiration_yy")
    private String expirationYY;

    @Column(name = "card_cvv")
    private String cardCVV;

    private int cashCard;

    @Column(name = "send_Time")
    private LocalDateTime send_Time = LocalDateTime.now();

}
