package com.jwt.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/getusers")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET"); // You can add other HTTP methods if needed
    }
}