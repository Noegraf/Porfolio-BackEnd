package com.example.persona.services;

import com.example.persona.entities.Experiencia;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServiceImpl extends BaseServiceImpl<Experiencia, Long> implements ExperienciaService {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    public ExperienciaServiceImpl(BaseRepository<Experiencia, Long> baseRepository) {
        super(baseRepository);
    }
}

