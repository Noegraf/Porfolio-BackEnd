package com.example.persona.services;

import com.example.persona.entities.Base;

import com.example.persona.repositories.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            //obtienen de la base de datos todas las entidades que tengamos registradas
            List<E> entities = baseRepository.findAll();
            return entities;

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            //es opcional porque no sabemos si va a encontrar a  ese id
            Optional<E> entityOptional = baseRepository.findById(id);
            //si encuentra la entity la retorna
            return entityOptional.get();
            //sino lanza la excepcion
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }



    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {

            entity = baseRepository.save(entity);
            return entity;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }



    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {

            Optional<E>entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate  = baseRepository.save(entity);
            return entityUpdate;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if(baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
