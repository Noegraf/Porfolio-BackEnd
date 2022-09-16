package com.example.persona.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@AllArgsConstructor
@Getter
@Setter
@Audited
@NoArgsConstructor
public class Persona extends Base/*implements Serializable*/ {

    /* LO ELIMINAMOS PORQUE SE CREO LA CLASE BASE Y AHORA EXTIENDE LA PROPIEDAD ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    */

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;


    @Column (name = "mail")
    private String mail;

    //length recibe hasta 1500 caracteres
    @Column (name = "sobre_mi", length = 5500)
    private String sobreMi;


    @Column (name = "url_img", length = 1500)
    private String urlImg;

    //esta cascada permite hacer la persistencia, actualizacion y eliminacion desde la persona
    //el orphan hace que al eliminar la persona tambien se eliminen todas las experiencias que posee
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_experiencia",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "experiencia_id")
    )
    private List<Experiencia> experiencias = new ArrayList<Experiencia>();


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_proyectos",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "proyectos_id")
    )
    private List<Proyecto> proyectos = new ArrayList<Proyecto>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "persona_formacion",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "formacion_id")
    )
    private List<Formacion> formacion = new ArrayList<Formacion>();

    }




