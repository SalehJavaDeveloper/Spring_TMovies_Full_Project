package com.movies.tMovies.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "login")
public class LoginDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "login_id")
    private int login_id;

    @Column(name = "username")
    private String username;

    @Column(name = "mail")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "mobile_phone")
    private String phoneNumber;

}
