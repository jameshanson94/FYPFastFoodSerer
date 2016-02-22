/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.controller;

import com.jameshanson.fastfood.model.Product;
import com.jameshanson.fastfood.service.ProductService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author James
 */
@Path("products")
public class ProductController {

    ProductService productService = new ProductService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProduct() {
        return productService.getProducts();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product addProduct(Product product) {
        return productService.addProduct(product);
    }

    @PUT
    @Path("{productId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product updateProduct(@PathParam("productId") long productId, Product product) {
        product.setId(productId);
        return productService.updateProduct(product);
    }
    
    @DELETE
    @Path("{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteProject(@PathParam("productId") long productId) {
        productService.deleteProduct(productId);        
    }

    @GET
    @Path("{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProduct(@PathParam("productId") long productId) {
        return productService.getProduct(productId);
    }

}
