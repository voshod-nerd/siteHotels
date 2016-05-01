/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.impl;

import com.infiniteskills.mvc.entity.User;
import com.infiniteskills.mvc.repository.UserRepository;
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
@Service("jpaUserService")
@Transactional
@Repository
public class UserRepositoryImpl implements UserRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<User> findAll() {
      return em.createNamedQuery("User.findAll").getResultList();
    }

    public List<User> findAllWithDetails() {
        return em.createNamedQuery("User.findAllWithDetail").getResultList();
    }

    public User save(User nomer) {
          if (nomer.getId() == null) {
            em.persist(nomer);
        } else {
            em.merge(nomer);
        }
        return nomer;
    }

    public void delete(User nomer) {
          User mergedDep = em.merge(nomer);
        em.remove(mergedDep);
    }

    public User create(User zav) {
         em.persist(zav);
        return zav;
    }

    public User update(User zav) {
        //int version = find(zav).getVersion();
        //Zayvka.setVersion(version);
        return em.merge(zav);
    }
    
    public User find(User zav) {
        return em.find(User.class, zav.getId());
    }
}
