/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.controller;

import com.jameshanson.fastfood.service.OrderService;
import javax.ws.rs.Path;

/**
 *
 * @author james
 */
@Path("orders")
public class OrderController {
    OrderService orderService = new OrderService();
    
}
