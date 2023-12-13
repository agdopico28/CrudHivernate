package com.example.crudhivernate.Models.Dao;

import com.example.crudhivernate.Models.Entity.Nadador;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public class ImplementsNadadorDAO implements INadadorDAO {

    private EntityManager entityManager;

    @Autowired
    public ImplementsNadadorDAO(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Nadador theNadador) {
        entityManager.persist(theNadador);
    }

}
