package com.movies.tMovies.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "profile_info")
@Getter
@Setter
public class AdminProfileInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long profileId;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "admin_developer")
    private String adminDeveloper;

    @Column(name = "admin_profile")
    private String adminProfile;

    @Column(name = "admin_project")
    private String adminProject;

    private String adminPanel;

}
