package com.example.persona.security.jwt;

import com.example.persona.entities.Usuario;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);
    private static final long EXPIRE_DURATION=1*60*60*1000;
    @Value("${app.jwt.secret}")
    private String secretKey;

    public String generateAccessToken(Usuario usuario) {

return Jwts.builder()
        .setSubject(usuario.getId() + "," + usuario.getEmail())
        .setIssuer("CodeJava")
        .setIssuedAt(new Date())
        .setExpiration(new Date(System.currentTimeMillis() +EXPIRE_DURATION))
        .signWith(SignatureAlgorithm.HS512,secretKey)
        .compact();
    }

    public boolean validateAccessToken(String token){
        try{
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;
        }catch (ExpiredJwtException ex) {
            LOGGER.error("JWT token expired");
        }catch (IllegalArgumentException ex) {
            LOGGER.error("Token is null or empty",ex);
        }catch (MalformedJwtException ex){
            LOGGER.error("JWT is invalid",ex);
        }catch (UnsupportedJwtException ex){
            LOGGER.error("JWT is not supported",ex);
        }catch (SignatureException ex){
            LOGGER.error("Signature vaidation failed",ex);
        }
        return false;
    }

    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }

    public Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
}
