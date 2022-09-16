package com.example.persona.services;

import com.example.persona.entities.Proyecto;
import com.example.persona.repositories.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class ProyectoServiceImpl extends BaseServiceImpl<Proyecto, Long> implements ProyectoService {

    public ProyectoServiceImpl(BaseRepository<Proyecto, Long> baseRepository) {
        super(baseRepository);
    }
}
