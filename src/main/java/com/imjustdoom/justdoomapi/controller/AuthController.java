package com.imjustdoom.justdoomapi.controller;

import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login data) {

        if (data.getName() == null) return ResponseEntity.notFound().build();

        // login stuff

        ResponseCookie cookie = ResponseCookie.from("token", data.getName()).httpOnly(false).maxAge(600).sameSite("None").secure(true).build();

        //return ResponseEntity.ok().header("Set-Cookie", cookie.toString()).build();
        return ResponseEntity.ok().body("{\"cookie\": \"" + cookie + "\"}");
    }

    @PostMapping("/logout2")
    public ResponseEntity<?> logout() {

        ResponseCookie cookie = ResponseCookie.from("token", "").httpOnly(false).sameSite("None").secure(true).maxAge(0).build();

        return ResponseEntity.ok().body("{\"cookie\": \"" + cookie + "\"}");
    }
}