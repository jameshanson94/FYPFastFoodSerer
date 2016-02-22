/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.service;

import com.jameshanson.fastfood.dao.OrderDAO;
import com.jameshanson.fastfood.dao.OrderDAOImpl;
import com.jameshanson.fastfood.model.Order;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author james
 */
public class OrderService {
    
    private final OrderDAO orderDAO =  new OrderDAOImpl();
    
    public OrderService() {}

    public List<Order> getOrders() {
        try {
            return orderDAO.getOrders();
        } catch (Exception ex) {
            Logger.getLogger(OrderService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
}
