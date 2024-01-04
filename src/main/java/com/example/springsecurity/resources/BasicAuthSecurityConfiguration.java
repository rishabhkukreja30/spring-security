package com.example.springsecurity.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class BasicAuthSecurityConfiguration {

//    adding configurations to store user details
    @Bean
    public UserDetailsService userDetailsService() {
        var user = User.withUsername("rishabh")
                .password("{noop}12345")
                .roles("USER")
                .build();

        var admin = User.withUsername("admin")
                .password("{noop}12345")
                .roles("ADMIN")
                .build();

        return  new InMemoryUserDetailsManager(user, admin);
    }

}
