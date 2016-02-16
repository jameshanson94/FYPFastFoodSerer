/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.configuration.dao;

import com.jameshanson.fastfood.model.Item;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author james
 */
public class ItemDAOImpl {
    
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
     EntityManager em = emf.createEntityManager();
     
     public List<Item> getAllItems(Long id) throws Exception {
         Query query = em.createQuery("select item from Item item", Item.class);
         return query.getResultList();
     }
}
