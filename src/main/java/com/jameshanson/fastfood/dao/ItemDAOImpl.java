/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.dao;

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
public class ItemDAOImpl implements ItemDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jameshanson_fastfood_war_1.0-SNAPSHOTPU");

    public ItemDAOImpl(){ }
    
    @Override
    public Item createItem(Item item) throws Exception {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return item;
    }
    
    @Override
    public Item updateItem(Item item) throws Exception {
        EntityManager em = emf.createEntityManager();
         try {
            em.getTransaction().begin();
            em.merge(item);
            em.getTransaction().commit();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return item;
    }

    @Override
    public List<Item> getAllItems() throws Exception {

        EntityManager em = emf.createEntityManager();
        List<Item> items = null;

        try {
            items = em.createQuery("SELECT i FROM Item i", Item.class).getResultList();
//            items = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return items;
    }

    @Override
    public Item retrieveItem(Long id) throws Exception {
        EntityManager em = emf.createEntityManager();
        return em.find(Item.class, id);
    }

    @Override
    public Item deleteItem(Long id) throws Exception {
         EntityManager em = emf.createEntityManager();
         Item item = em.find(Item.class, id);
         
         try {
             em.getTransaction().begin();
             em.remove(item);
             em.getTransaction().commit();
         } finally {
            if (em != null) {
                em.close();
            }
        }
         
         return item;
    }
}
