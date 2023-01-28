//package com.movies.tMovies.configuration;
//
//import com.movies.tMovies.filter.CustomAuthenticationFilter;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;
//
//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
//    private final UserDetailsService userDetailsService;
//
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//
//
//    @Bean
//    void registerProvider(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
//     http.csrf().disable();
//     http.sessionManagement().sessionCreationPolicy(STATELESS);
//     http.authorizeHttpRequests().anyRequest().permitAll();
//     http.addFilter(new CustomAuthenticationFilter());
//     return null;
//    }
//
//
//
//
//}
