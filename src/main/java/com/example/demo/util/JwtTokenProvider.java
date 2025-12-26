package com.example.demo.security;

import java.util.Set;
import io.jsonwebtoken.Claims;

public class JwtTokenProvider {

    public String createToken(Long userId, String email, Set<String> roles) {
        return "token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public Claims getClaims(String token) {
        return io.jsonwebtoken.Jwts.claims();
    }
}
