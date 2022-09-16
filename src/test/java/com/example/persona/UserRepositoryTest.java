package com.example.persona;


import com.example.persona.entities.Usuario;
import com.example.persona.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    UsuarioRepository repo;

    @Test
    protected void testCreateUser(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "123456";
        String encodePassword = passwordEncoder.encode(rawPassword);
        Usuario newUsuario = new Usuario("admin@mail.com", encodePassword);
        Usuario saveUsuario = repo.save(newUsuario);
        assertThat(saveUsuario).isNotNull();
        assertThat(saveUsuario.getId()).isGreaterThan(0);
    }
}
