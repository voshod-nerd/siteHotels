/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiniteskills.mvc.repository;

import com.infiniteskills.mvc.entity.Rabota;
import java.util.List;

/**
 *
 * @author Юыху
 */
public interface RabotaRepository {
    List<Rabota> findAll();

    Rabota update(Rabota rab);

    Rabota create(Rabota rab);

    List<Rabota> findAllWithDetails();

    Rabota save(Rabota rab);

    void delete(Rabota rab);
}
