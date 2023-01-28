package com.movies.tMovies.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminProfileInfoDto {

    private Long profileId;
    private String adminName;
    private String adminEmail;
    private String adminDeveloper;
    private String adminProfile;
    private String adminProject;
    private String adminPanel;
}
