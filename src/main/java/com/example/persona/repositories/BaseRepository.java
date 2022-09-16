package com.example.persona.repositories;


import com.example.persona.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

//este no, no deja que se creen instancias de esta interface
//@NoRepositoryBean

//esta será la base de los repositorios
public interface BaseRepository<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

}
