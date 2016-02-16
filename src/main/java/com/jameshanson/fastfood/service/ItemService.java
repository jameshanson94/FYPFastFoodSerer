/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.service;

import com.jameshanson.fastfood.configuration.database.DatabaseClass;
import com.jameshanson.fastfood.model.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author James
 */
public class ItemService {
    
    private Map<Long, Item> items = DatabaseClass.getItems();
    
    public ItemService(){
        items.put(1L, new Item(1,"Pizza",4.99, 1));
        items.put(2L, new Item(2,"Pizza",4.99, 1));
        items.put(3L, new Item(3,"Pizza",4.99, 1));     
        items.put(4L, new Item(4,"Pizza",4.99, 1));  
    }  
    
    public List<Item> getItems() {        
        return new ArrayList<Item>(items.values());        
    }

    public Item getItem(long id) {
        return items.get(id);
    }

    public Item addItem(Item item) {
        item.setId(items.size() + 1);
        items.put(item.getId(), item);
        return item;        
    }
    
    public Item updateItem(Item item) {
        if(item.getId() <= 0){
            return null;
        }
        items.put(item.getId(), item);
        return item;
    }
    
    public Item deleteItem(long id) {
        return items.remove(id);
    }
}
