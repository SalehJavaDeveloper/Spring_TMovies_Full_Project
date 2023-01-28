//package com.movies.tMovies.controller;
//
//import com.movies.tMovies.domain.AppUser;
//import com.movies.tMovies.domain.Role;
//import com.movies.tMovies.dto.RoleToUserForm;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api")
//public class UserResource {
//
//    private final UserServiceImpl userService;
//
//    @GetMapping("/users")
//    public ResponseEntity<List<AppUser>> getUsers(){
//        return ResponseEntity.ok().body(userService.getusers());
//    }
//    @PostMapping("/user/save")
//    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser appUser){
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
//        return ResponseEntity.created(uri).body(userService.saveUser(appUser));
//    }
//    @PostMapping("/role/save")
//    public ResponseEntity<Role> saveRole(@RequestBody Role role){
//        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
//        return ResponseEntity.created(uri).body(userService.saveRole(role));
//    }
//    @PostMapping("/role/addtouser")
//    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm roleToUserForm){
//        userService.addRoleToUser(roleToUserForm.getUsername(),roleToUserForm.getRoleName());
//        return ResponseEntity.ok().build();
//    }
//}
