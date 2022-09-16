package com.example.persona.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Entity
@Table(name = "experiencia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Experiencia extends Base{

    @Column(name = "nombre_empresa")
    private String nombreEmpresa;

    @Column(name = "fecha")
    private int fecha;

    @Column (name = "descripcion", length = 1500)
    private String descripcion;

    /*
    @ManyToMany
    @JoinColumn(name = "fk_hard")
    private Hard hard;

    @ManyToMany
    @JoinColumn(name = "fk_soft")
    private Soft soft;

     */
}