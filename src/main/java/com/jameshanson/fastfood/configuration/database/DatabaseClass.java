/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.configuration.database;

import com.jameshanson.fastfood.model.Item;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author James
 */
public class DatabaseClass {
    private static Map<Long, Item> items = new HashMap<>();
    
    public static Map<Long, Item> getItems() {
        return items;
    }
    
}
