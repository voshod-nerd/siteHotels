/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.repository;

import com.infiniteskills.mvc.entity.Remont;
import java.util.List;

/**
 *
 * @author Юыху
 */
public interface RemontRepository {
      List<Remont> findAll();

    Remont update(Remont rab);

    Remont create(Remont rab);

    List<Remont> findAllWithDetails();

    Remont save(Remont rab);

    void delete(Remont rab);
}
