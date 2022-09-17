package com.example.persona.controllers;


import com.example.persona.entities.Formacion;
import com.example.persona.services.FormacionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://argprogrfrontenduno.web.app")
@RequestMapping(path = "api/v1/formaciones")
public class FormacionController extends BaseControllerImpl<Formacion, FormacionServiceImpl>{
}
