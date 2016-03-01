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
public interface OrderState {
    public void prepareOrder(Order order); 
    public void cancelOrder(Order order);
    public void shipOrder(Order order);
    public void deliverOrder(Order order);
}
