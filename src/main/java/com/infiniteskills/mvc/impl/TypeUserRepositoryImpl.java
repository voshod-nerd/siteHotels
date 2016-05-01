/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.impl;

import com.infiniteskills.mvc.entity.Typeuser;
import com.infiniteskills.mvc.repository.TypeUserRepository;
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

@Service("jpaTypeUserService")
@Transactional
@Repository
public class TypeUserRepositoryImpl implements TypeUserRepository {
    @PersistenceContext
    private EntityManager em;
    
    public List<Typeuser> findAll() {
      return em.createNamedQuery("Bron.findAll").getResultList();
    }

    public List<Typeuser> findAllWithDetails() {
        return em.createNamedQuery("Bron.findAllWithDetail").getResultList();
    }

    public Typeuser save(Typeuser nomer) {
          if (nomer.getId() == null) {
            em.persist(nomer);
        } else {
            em.merge(nomer);
        }
        return nomer;
    }

    public void delete(Typeuser nomer) {
          Typeuser mergedDep = em.merge(nomer);
        em.remove(mergedDep);
    }

    public Typeuser create(Typeuser zav) {
         em.persist(zav);
        return zav;
    }

    public Typeuser update(Typeuser zav) {
        //int version = find(zav).getVersion();
        //Zayvka.setVersion(version);
        return em.merge(zav);
    }
    
    public Typeuser find(Typeuser zav) {
        return em.find(Typeuser.class, zav.getId());
    } 
}
