package com.example.persona.services;

import com.example.persona.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception; //trae una lista de todas las personas en nuestra base de datos, luego de todas las entidades que tengamos
    public E findById(ID id) throws Exception; //tre una entidad de acuerdo a su id
    public E save(E entity) throws Exception;//crea nueva entidad y para eso le enviamos una nueva entidad al repositorio
    public E update(ID id, E entity) throws Exception;//tiene los parametros id y entidad (actualizada)
    public boolean delete(ID id) throws Exception;//se encarga de eliminar un registro en la base de datos



}
