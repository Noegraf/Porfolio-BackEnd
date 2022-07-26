package com.example.persona.controllers;

import com.example.persona.entities.Proyecto;
import com.example.persona.services.ProyectoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://argprogrfrontenduno.web.app")
@RequestMapping(path = "/api/v1/proyectos")
public class ProyectoController extends BaseControllerImpl<Proyecto, ProyectoServiceImpl> {
}
