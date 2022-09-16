package com.example.persona.services;

import com.example.persona.entities.Formacion;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.FormacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FormacionServiceImpl extends BaseServiceImpl<Formacion, Long> implements FormacionService {

    @Autowired
    private FormacionRepository formacionRepository;

    public FormacionServiceImpl(BaseRepository<Formacion, Long> baseRepository) {
        super(baseRepository);
    }
}
