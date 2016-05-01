/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.impl;

import com.infiniteskills.mvc.entity.Remont;
import com.infiniteskills.mvc.repository.RemontRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Юыху
 */
@Service("jpaRemontService")
@Transactional
@Repository
public class RemontRepositoryImpl implements RemontRepository {
    @PersistenceContext
    private EntityManager em;
    
    public List<Remont> findAll() {
      return em.createNamedQuery("Remont.findAll").getResultList();
    }

    public List<Remont> findAllWithDetails() {
        return em.createNamedQuery("Remont.findAllWithDetail").getResultList();
    }

    public Remont save(Remont nomer) {
          if (nomer.getId() == null) {
            em.persist(nomer);
        } else {
            em.merge(nomer);
        }
        return nomer;
    }

    public void delete(Remont nomer) {
          Remont mergedDep = em.merge(nomer);
        em.remove(mergedDep);
    }

    public Remont create(Remont zav) {
         em.persist(zav);
        return zav;
    }

    public Remont update(Remont zav) {
      
        return em.merge(zav);
    }
    
    public Remont find(Remont zav) {
        return em.find(Remont.class, zav.getId());
    }
}
