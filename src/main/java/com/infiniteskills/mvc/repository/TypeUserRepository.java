/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.repository;

import com.infiniteskills.mvc.entity.Typeuser;
import java.util.List;

/**
 *
 * @author Юыху
 */
public interface TypeUserRepository {
    List<Typeuser> findAll();

    Typeuser update(Typeuser rab);

    Typeuser create(Typeuser rab);

    List<Typeuser> findAllWithDetails();

    Typeuser save(Typeuser rab);

    void delete(Typeuser rab);
}
