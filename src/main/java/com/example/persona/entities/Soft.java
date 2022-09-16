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
@Table(name = "soft")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Soft extends Base{


    @Column(name = "soft")
    private String soft;


}
