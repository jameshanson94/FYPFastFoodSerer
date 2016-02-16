/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jameshanson.fastfood.configuration.dao;

import com.jameshanson.fastfood.model.Item;
import java.util.List;

/**
 *
 * @author james
 */
public interface ItemDAO {
    
    public List<Item> getAllItems(Long id) throws Exception;
    
}
