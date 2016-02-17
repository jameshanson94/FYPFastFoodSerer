/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.service;

import com.jameshanson.fastfood.dao.ItemDAO;
import com.jameshanson.fastfood.dao.ItemDAOImpl;
import com.jameshanson.fastfood.configuration.database.DatabaseClass;
import com.jameshanson.fastfood.model.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author James
 */
public class ItemService {

    private Map<Long, Item> items = DatabaseClass.getItems();
    private ItemDAO itemDao = new ItemDAOImpl();

    public ItemService() {
        items.put(1L, new Item(1, "Pizza", 4.99, 1));
        items.put(2L, new Item(2, "Pizza", 4.99, 1));
        items.put(3L, new Item(3, "Pizza", 4.99, 1));
        items.put(4L, new Item(4, "Pizza", 4.99, 1));
    }

    public List<Item> getItems() {
        try {
//        return new ArrayList<Item>(items.values());            
            return new ItemDAOImpl().getAllItems();
        } catch (Exception ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    public Item getItem(long id) {
        return items.get(id);
    }

    public Item addItem(Item item) {
        try {
//        item.setId(items.size() + 1);
//        items.put(item.getId(), item);
//        return item;
            System.out.println(item);
            itemDao.createItem(item);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return item;
    }

    public Item updateItem(Item item) {
        if (item.getId() <= 0) {
            return null;
        }
        try {
            return new ItemDAOImpl().updateItem(item);
        } catch (Exception ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Item deleteItem(long id) {        
        try {
            return new ItemDAOImpl().deleteItem(id);
        } catch (Exception ex) {
            Logger.getLogger(ItemService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
