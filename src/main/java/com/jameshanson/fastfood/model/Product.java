/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author James
 */
@Entity
public class Product implements Serializable {
    
    @Id
    @Column(name="PRODUCT_ID")
    private long productId;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="PRICE")
    private Double price;
    
    @Column(name="FOOD_TYPE")
    private int foodType;

    public Product() {
    }

    public Product(long productId, String name, Double price, int foodType) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.foodType = foodType;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getFoodType() {
        return foodType;
    }

    public void setFoodType(int foodType) {
        this.foodType = foodType;
    } 

    @Override
    public String toString() {
        return "Item{" + "id=" + productId + ", name=" + name + ", price=" + price + ", foodType=" + foodType + '}';
    }
    
    
}
