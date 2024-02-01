package com.springdblogin.dblogin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
@Bean
public BCryptPasswordEncoder PasswordEncoder(){
    return new BCryptPasswordEncoder();
}

// public UserDetailsService getDetailsService()
// @Bean
// public DaoAuthenticationProvider authenticationProvider(){
//     DaoAuthenticationProvider daoAuthenticationProvider =new DaoAuthenticationProvider();

// }

}
