package com.imjustdoom.justdoomapi.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@CrossOrigin(origins = "*")
public class BlogController {

    @PostMapping("/post-blog")
    public ResponseEntity<?> login(@RequestBody String data) {

        System.out.println(data);

       // if (data.getName() == null) return ResponseEntity.notFound().build();

        //if (!data.getName().equals("JustDoom") || !data.getPassword().equals("someRandomPazzw0rd")) return ResponseEntity.ok().header("Authorization", "Bearer").build();

        //ResponseCookie cookie = ResponseCookie.from("token", data.getName()).httpOnly(false).maxAge(60).sameSite("None").secure(true).build();

        return ResponseEntity.ok().build();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer2() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "OPTIONS");
            }
        };
    }
}
