package com.example.persona.services;


import com.example.persona.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll() throws Exception;

    Usuario findById(Long aLong) throws Exception;

    Usuario save(Usuario entity) throws Exception;

    Usuario update(Long aLong, Usuario entity) throws Exception;

    boolean delete(Long aLong) throws Exception;

    Usuario buscarUsuarioPorId(Long id);

    Usuario editarUsuario(Usuario usuario);

}
