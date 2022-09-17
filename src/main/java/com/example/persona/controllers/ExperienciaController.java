package com.example.persona.controllers;

import com.example.persona.entities.Experiencia;
import com.example.persona.services.ExperienciaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://argprogrfrontenduno.web.app")
@RequestMapping(path = "/api/v1/experiencias")
public class ExperienciaController extends BaseControllerImpl<Experiencia, ExperienciaServiceImpl> {
}
