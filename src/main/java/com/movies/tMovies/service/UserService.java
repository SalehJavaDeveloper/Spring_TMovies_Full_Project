//package com.movies.tMovies.service;
//
//import com.movies.tMovies.domain.AppUser;
//import com.movies.tMovies.domain.Role;
//import com.movies.tMovies.repository.RoleRepository;
//import com.movies.tMovies.repository.UserRepository;
//import com.movies.tMovies.service.Impl.UserServiceImpl;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//@Transactional
//@Slf4j
//public class UserService implements UserServiceImpl, UserDetailsService {
//    private final UserRepository userRepository;
//    private final RoleRepository roleRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        AppUser appUser = userRepository.findByUsername(username);
//        if(appUser == null){
//            log.error("User not found in the database");
//            throw  new UsernameNotFoundException("User not found in the database");
//        }else {
//            log.info("User found in the database: {}",username);
//        }
//        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        appUser.getRoles().forEach(role -> {authorities.add(new SimpleGrantedAuthority(role.getName()));
//        });
//        return new org.springframework.security.core.userdetails.User(appUser.getUsername(),appUser.getPassword(),authorities);
//    }
//    @Override
//    public AppUser saveUser(AppUser user) {
//        log.info("Saving new user {} to the database",user.getName());
//    return userRepository.save(user);
//    }
//
//    @Override
//    public Role saveRole(Role role) {
//        log.info("Saving new role {} to the database",role.getName());
//        return roleRepository.save(role);
//    }
//
//    @Override
//    public void addRoleToUser(String username, String roleName) {
//        log.info("Adding role {} to user {},role.getName()",roleName,username);
//    AppUser appUser = userRepository.findByUsername(username);
//    Role role = roleRepository.findByName(roleName);
//    appUser.getRoles().add(role);
//    }
//
//    @Override
//    public AppUser getUser(String username) {
//        log.info("Fetching user {}",username);
//        return userRepository.findByUsername(username);
//    }
//
//    @Override
//    public List<AppUser> getusers() {
//        log.info("Fetching all users");
//        return userRepository.findAll();
//    }
//
//
//}
