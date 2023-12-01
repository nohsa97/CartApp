package com.cart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Cart {
    HashMap<Product, Integer> products = new HashMap<>();

    public void showItems() {
        System.out.println(toString());
    }

    public void addProduct(Product insertProduct, int insertCount) {
        products.put(insertProduct,insertCount);
    }

    public void removeProduct(Product insert) {
        products.remove(insert);
    }

    @Override
    public String toString() {
        return "카트 내용물 : " + products + "개"+ '}';
    }
}
