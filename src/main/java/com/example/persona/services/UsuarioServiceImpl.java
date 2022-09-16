package com.example.persona.services;


import com.example.persona.entities.Usuario;
import com.example.persona.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        super();

}

    @Override
    public List<Usuario> findAll() throws Exception {
        return null;
    }

    @Override
    public Usuario findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Usuario save(Usuario entity) throws Exception {
        return null;
    }

    @Override
    public Usuario update(Long id, Usuario entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }

    @Override
    public Usuario buscarUsuarioPorId(Long id) {
        return null;
    }



    @Override
    public Usuario editarUsuario(Usuario usuario) {
        return null;
    }
}