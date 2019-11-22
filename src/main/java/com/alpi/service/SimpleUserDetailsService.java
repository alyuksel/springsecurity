package com.alpi.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SimpleUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        /**
         <pre>
         * <code>
         * PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
         * // outputs {bcrypt}$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG
         * // remember the password that is printed out and use in the next step
         * System.out.println(encoder.encode("password"));
         * </code>
         * </pre>
         *
         * <pre>
         * <code>
         * UserDetails user = User.withUsername("user")
         *     .password("{bcrypt}$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG")
         *     .roles("USER")
         *     .build();
         * </code>
         * </pre>
         */

        // Utiliser plutot le code au dessus
        return User.withDefaultPasswordEncoder().username("alpi").password("ryuryuryu").roles("USER").build();
    }
}
