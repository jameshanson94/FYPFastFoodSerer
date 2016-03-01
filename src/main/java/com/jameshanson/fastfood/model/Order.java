/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.model;

import com.jameshanson.fastfood.model.OrderState.OrderState;
import com.jameshanson.fastfood.model.OrderState.OrderedOrderState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author james
 */
@Entity
@Table(name="TABLE_ORDER")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="PURCHASE_ID")    
    private int orderId;
//    
    @OneToOne
    private Account account;
    
    @OneToOne
    private Address address;
    
    private OrderState orderState;
//    private Date timeStamp;
    @Column(name="TOTAL_COST")
    private long totalCost;
    
    @OneToMany(cascade=CascadeType.ALL)
    private Collection<Product> products;

    public Order() {

    }

    public Order(long totalCost) {
//        this.user = new User(1, "Test", "Password");
//        this.address = new Address(1);
       // this.orderState = new OrderedOrderState();
//        this.timeStamp = timeStamp;
        this.totalCost = totalCost;
//        products = new ArrayList<Product>();
//       allProducts.add(new Product(1, "James", 4.99, 1));
//        allProducts.add(new Product(2, "James", 4.99, 1));
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    /*public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }*/

//    public Date getTimeStamp() {
//        return timeStamp;
//    }
//
//    public void setTimeStamp(Date timeStamp) {
//        this.timeStamp = timeStamp;
//    }
    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Collection<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        //return "Order{" + "orderId=" + orderId + ", user=" + user + ", address=" + address + ", state=" + orderState + ", totalCost=" + totalCost + '}';
        return "";
    }
}
