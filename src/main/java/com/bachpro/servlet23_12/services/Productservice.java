package com.bachpro.servlet23_12.services;

import com.bachpro.servlet23_12.models.Product;

import java.util.ArrayList;
import java.util.List;

public class Productservice {
   public static List<Product> productList = new ArrayList<>();
static {
productList.add(new Product(1,"ok1","fghfg",true,5000));
productList.add(new Product(2,"ok2","fghfghfgfg",true,6000));

}

}
