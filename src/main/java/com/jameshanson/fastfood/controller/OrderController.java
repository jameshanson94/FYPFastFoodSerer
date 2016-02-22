/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.controller;

import com.jameshanson.fastfood.model.Order;
import com.jameshanson.fastfood.service.OrderService;
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
 * @author james
 */
@Path("orders")
@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
public class OrderController {
    OrderService orderService = new OrderService();
    
    @GET
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
    
    @POST
    public Order addOrder(Order order) {
        return orderService.addOrder(order);
    }
    
    @GET
    @Path("{orderId}")
    public Order getOrder(@PathParam("orderId") int orderId) {
        return orderService.getOrder(orderId);
    }
    
    @DELETE
    @Path("{orderId}")
    public void deleteOrder(@PathParam("orderId") int orderId) {
        orderService.deleteOrder(orderId);
    }
    
    @PUT
    @Path("{orderId}")
    public Order updateItem(@PathParam("orderId") int orderId, Order order) {
        order.setOrderId(orderId);
        return orderService.updateOrder(order);
    }
    
    
    
    
    
    
}
