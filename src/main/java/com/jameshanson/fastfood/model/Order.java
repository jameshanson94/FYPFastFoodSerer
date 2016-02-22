/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.model;

import com.jameshanson.fastfood.model.OrderState.OrderState;
import com.jameshanson.fastfood.model.OrderState.OrderedOrderState;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author james
 */
public class Order {
    
    private int orderId;
    private User user;
    private Address address;
    private OrderState orderState;
    private Date timeStamp;
    private long totalCost;
    private List<Product> allItems;
    
    
    public Order() {
        
    }

    public Order(int orderId, User user, Address address, OrderState orderState, Date timeStamp, long totalCost) {
        this.orderId = orderId;
        this.user = user;
        this.address = address;
        this.orderState = new OrderedOrderState();
        this.timeStamp = timeStamp;
        this.totalCost = totalCost;
        allItems = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }
    
    public void addItem(Product item) {
        allItems.add(item);
    }
    
    public void remoteItem(Product item) {
        allItems.remove(item);
    }
    
    public List<Product> getItems() {
        return allItems;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", user=" + user + ", address=" + address + ", state=" + orderState + ", timeStamp=" + timeStamp + ", totalCost=" + totalCost + '}';
    }

    
    
    
    
    
}
