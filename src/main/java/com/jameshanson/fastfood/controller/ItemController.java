/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.controller;

import com.jameshanson.fastfood.model.Item;
import com.jameshanson.fastfood.service.ItemService;
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
@Path("items")
public class ItemController {

    ItemService itemService = new ItemService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Item addItem(Item item) {
        return itemService.addItem(item);
    }

    @PUT
    @Path("{itemId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Item updateItem(@PathParam("itemId") long itemId, Item item) {
        item.setId(itemId);
        return itemService.updateItem(item);
    }
    
    @DELETE
    @Path("{itemId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteItem(@PathParam("itemId") long itemId) {
        itemService.deleteItem(itemId);        
    }

    @GET
    @Path("{itemId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Item getItem(@PathParam("itemId") long itemId) {
        return itemService.getItem(itemId);
    }

}
