/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.service;

import com.jameshanson.fastfood.dao.ProductDAOImpl;
import com.jameshanson.fastfood.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import com.jameshanson.fastfood.dao.ProductDAO;

/**
 *
 * @author James
 */
public class ProductService {

    private final ProductDAO productDAO = new ProductDAOImpl();

    public ProductService() {
    }

    public List<Product> getProducts() {
        try {          
            return productDAO.getAllProducts();
        } catch (Exception ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    public Product getProduct(long id) {
        try {
            return productDAO.retrieveProduct(id);
        } catch (Exception ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Product addProduct(Product product) {
        try {
            System.out.println(product);
            productDAO.createProduct(product);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return product;
    }

    public Product updateProduct(Product product) {
        if (product.getProductId() <= 0) {
            return null;
        }
        try {
            return productDAO.updateProduct(product);
        } catch (Exception ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Product deleteProduct(long id) {        
        try {
            return productDAO.deleteProduct(id);
        } catch (Exception ex) {
            Logger.getLogger(ProductService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
