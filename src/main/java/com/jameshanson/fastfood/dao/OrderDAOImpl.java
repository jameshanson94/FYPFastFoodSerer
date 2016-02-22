/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.dao;

import com.jameshanson.fastfood.model.Item;
import com.jameshanson.fastfood.model.Order;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author james
 */
public class OrderDAOImpl implements OrderDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jameshanson_fastfood_war_1.0-SNAPSHOTPU");
    public OrderDAOImpl() {}

    @Override
    public List<Order> getOrders() throws Exception {
       EntityManager em = emf.createEntityManager();
       List<Order> orders = null;
       
       Query query = em.createQuery("SELECT o FROM Order o", Order.class);
       orders = query.getResultList();
       return orders;
    }

    @Override
    public Order createOrder(Order order) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order retrieveOrder(int orderId) throws Exception {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Order.class, orderId);
        } catch(Exception e) {
            System.out.println(e);
            
        }
        return null;
    }

    @Override
    public void updateOrder(Order order) throws Exception {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(order);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if(em != null) {
                em.close();
            }
        }
    }

    @Override
    public void deleteOrder(int orderId) throws Exception {
        EntityManager em = emf.createEntityManager();
        Order order = em.find(Order.class, orderId);
        
        try {
            em.getTransaction().begin();
            em.remove(order);
            em.getTransaction().commit();
        } finally {
            if (em!= null) {
                em.close();
            }
        }
        
    }
    
}
