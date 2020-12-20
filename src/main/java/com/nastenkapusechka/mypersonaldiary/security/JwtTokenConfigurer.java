//package com.nastenkapusechka.mypersonaldiary.security;
//
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//public class JwtTokenConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
//    private JwtTokenProvider jwtTokenProvider;
//
//    public JwtTokenConfigurer(JwtTokenProvider jwtTokenProvider) {
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    @Override
//    public void configure(HttpSecurity builder) throws Exception {
//        JwtTokenFilter jwtTokenFilter = new JwtTokenFilter(jwtTokenProvider);
//        builder.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//}
