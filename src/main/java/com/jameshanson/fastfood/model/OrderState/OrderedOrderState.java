/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.model.OrderState;

import com.jameshanson.fastfood.model.Order;

/**
 *
 * @author james
 */
public class OrderedOrderState implements OrderState {
    
    public void prepareOrder(Order order) {
        System.out.println("State is now Ordered");
        order.setOrderState(this);       
        
    } 
    
    public void cancelOrder(Order order) {
        System.out.println("order is now cancelled");
    }

    @Override
    public void updateOrderState(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
