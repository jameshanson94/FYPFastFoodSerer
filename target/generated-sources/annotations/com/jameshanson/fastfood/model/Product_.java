package com.jameshanson.fastfood.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-01T13:27:01")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Long> productId;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile SingularAttribute<Product, Integer> foodType;
    public static volatile SingularAttribute<Product, String> name;

}