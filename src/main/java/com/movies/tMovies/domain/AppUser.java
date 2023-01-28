package com.movies.tMovies.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@Table(name = "appuser")
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
   private Long id;

    @Column(name = "name")
   private String name;

    @Column(name = "username")
   private String username;

    @Column(name = "password")
   private String password;

    @Column(name = "app_roles")
    @ManyToMany(fetch = FetchType.EAGER)
   private Collection<Role> roles = new ArrayList<>();


}
