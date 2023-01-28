package com.movies.tMovies.controller;



import com.movies.tMovies.storage.UserStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class UsersController {



//    @GetMapping("/registration")
//    public ResponseEntity<Void> register() {
//       // System.out.println("handling register user request: " + userName);
//        try {
//           // UserStorage.getInstance().setUser(userName);
//            UserStorage.getInstance().setUser("Saleh");
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().build();
//        }
//        return ResponseEntity.ok().build();
//    }
    @GetMapping("/registration/{userName}")
    public ResponseEntity<Void> register(@PathVariable String userName) {
        // System.out.println("handling register user request: " + userName);
        try {
            // UserStorage.getInstance().setUser(userName);
            UserStorage.getInstance().setUser(userName);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/fetchAllUsers")
    public Set<String> fetchAll() {
        return UserStorage.getInstance().getUsers();
    }
}