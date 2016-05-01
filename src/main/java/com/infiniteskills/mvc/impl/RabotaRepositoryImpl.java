/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.impl;

import com.infiniteskills.mvc.entity.Rabota;
import com.infiniteskills.mvc.repository.RabotaRepository;
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
@Service("jpaRabotaService")
@Transactional
@Repository
public class RabotaRepositoryImpl implements RabotaRepository {
     @PersistenceContext
    private EntityManager em;
    
    public List<Rabota> findAll() {
      return em.createNamedQuery("Zayvka.findAll").getResultList();
    }

    public List<Rabota> findAllWithDetails() {
        return em.createNamedQuery("Zayvka.findAllWithDetail").getResultList();
    }

    public Rabota save(Rabota nomer) {
          if (nomer.getId() == null) {
            em.persist(nomer);
        } else {
            em.merge(nomer);
        }
        return nomer;
    }

    public void delete(Rabota nomer) {
          Rabota mergedDep = em.merge(nomer);
        em.remove(mergedDep);
    }

    public Rabota create(Rabota zav) {
         em.persist(zav);
        return zav;
    }

    public Rabota update(Rabota zav) {
      
        return em.merge(zav);
    }
    
    public Rabota find(Rabota zav) {
        return em.find(Rabota.class, zav.getId());
    }
}
