/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.dao;

import com.jameshanson.fastfood.model.Order;
import java.util.List;

/**
 *
 * @author james
 */
public interface OrderDAO {
    
    public List<Order> getOrders() throws Exception;
    public Order createOrder(Order order) throws Exception;
    public Order retrieveOrder(int orderId) throws Exception;
    public Order updateOrder(Order order) throws Exception;
    public void deleteOrder(int orderId) throws Exception;
    
    
}
