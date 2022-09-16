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
@Table(name = "proyecto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Proyecto extends Base {

    @Column(name = "rol")
    private String rol;

    @Column(name = "descripcion", length = 1500)
    private String descripcion;

    @Column(name = "url_proyecto")
    private String urlProyecto;

    @Column(name = "url_img")
    private String urlImg;
}
