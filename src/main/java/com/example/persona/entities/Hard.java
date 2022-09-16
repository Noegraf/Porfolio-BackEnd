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
@Table(name = "hard")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Hard extends Base{


    @Column(name = "hard")
    private String hard;



}
