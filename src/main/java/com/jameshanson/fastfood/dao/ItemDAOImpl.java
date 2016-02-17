/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.configuration.dao;

import com.jameshanson.fastfood.model.Item;
import java.sql.PreparedStatement;
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

    public Item createItem(Long id, String name, Double price, int foodType) 
        throws Exception {
        return null;
    }

    public List<Item> getAllItems(Long id) throws Exception {

        
        EntityManager em = emf.createEntityManager();         
        List<Item> items = null;

        try {
            Query query = em.createQuery("SELECT i FROM Item i", Item.class);
            items = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return items;
    }
}
