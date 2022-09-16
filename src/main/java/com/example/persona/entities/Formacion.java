package com.example.persona.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "formacion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Formacion extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "institucion")
    private String institucion;

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "img")
    private String img;

}
