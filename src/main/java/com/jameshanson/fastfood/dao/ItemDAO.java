/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.dao;

import com.jameshanson.fastfood.model.Item;
import java.util.List;

/**
 *
 * @author james
 */
public interface ItemDAO {
    
    public Item createItem(Item item) throws Exception;
    public Item updateItem(Item item) throws Exception;
    public Item retrieveItem(Long id) throws Exception;
    public Item deleteItem(Long id) throws Exception;
    public List<Item> getAllItems() throws Exception;
    
}
