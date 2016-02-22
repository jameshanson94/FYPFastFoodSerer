/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.dao;

import com.jameshanson.fastfood.model.Product;
import java.util.List;

/**
 *
 * @author james
 */
public interface ProductDAO {
    
    public Product createProduct(Product product) throws Exception;
    public Product updateProduct(Product prodct) throws Exception;
    public Product retrieveProduct(Long id) throws Exception;
    public Product deleteProduct(Long id) throws Exception;
    public List<Product> getAllProducts() throws Exception;
    
}
