/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.dao;

import com.jameshanson.fastfood.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author james
 */
public class ProductDAOImpl implements ProductDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.jameshanson_fastfood_war_1.0-SNAPSHOTPU");

    public ProductDAOImpl(){ }
    
    @Override
    public Product createProduct(Product product) throws Exception {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(product);
            em.getTransaction().commit();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return product;
    }
    
    @Override
    public Product updateProduct(Product product) throws Exception {
        EntityManager em = emf.createEntityManager();
         try {
            em.getTransaction().begin();
            em.merge(product);
            em.getTransaction().commit();

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return product;
    }

    @Override
    public List<Product> getAllProducts() throws Exception {

        EntityManager em = emf.createEntityManager();
        List<Product> products = null;

        try {
            products = em.createQuery("SELECT P FROM Product P", Product.class).getResultList();
//            items = query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return products;
    }

    @Override
    public Product retrieveProduct(Long id) throws Exception {
        EntityManager em = emf.createEntityManager();
        return em.find(Product.class, id);
    }

    @Override
    public Product deleteProduct(Long id) throws Exception {
         EntityManager em = emf.createEntityManager();
         Product product = em.find(Product.class, id);
         
         try {
             em.getTransaction().begin();
             em.remove(product);
             em.getTransaction().commit();
         } finally {
            if (em != null) {
                em.close();
            }
        }
         
         return product;
    }
}
