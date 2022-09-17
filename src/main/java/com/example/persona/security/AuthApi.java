package com.example.persona.security;

import com.example.persona.entities.Usuario;
import com.example.persona.security.jwt.JwtTokenUtil;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping
public class AuthApi {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @PostMapping(path = "/api/login" )
    public ResponseEntity<?> login(@RequestBody @Valid @NotNull AuthRequest request){
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getEmail(), request.getPassword()));

            Usuario usuario = (Usuario) authentication.getPrincipal();
            String accessToken = jwtTokenUtil.generateAccessToken(usuario);
            AuthResponse response = new AuthResponse(usuario.getEmail(), accessToken);

            return ResponseEntity.ok().body(response);


        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
