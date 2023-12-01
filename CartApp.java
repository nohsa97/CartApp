package com.cart;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        //상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        // 상품 클래스를 생성해서 상품 목록에 넣기
        Product milk = new Product("우유", 3000);
        Product cheese = new Product("치즈", 5000);
        Product cola = new Product("콜라", 2000);
        Product tissue = new Product("화장지", 4000);
        productSet.add(milk);
        productSet.add(cheese);
        productSet.add(cola);
        productSet.add(tissue);


//        productSet.add(new Product("콜라", 2000));
//        productSet.add(new Product("화장지", 4000));

        //상품 목록 확인
        for(Product product : productSet) {
            System.out.println(product.getNo()+product.getName() + " : " + product.getPrice());
        }

        //장바구니 생성
        Cart myCart = new Cart();
        myCart.addProduct(milk,2);
        myCart.addProduct(cheese,3);

        myCart.showItems();

        myCart.removeProduct(milk);

        myCart.showItems();
        //상품을 장바구니에 추가
        //상품을 장바구니에 제거
        // 현재 담긴 물품 출력 (이름, 갯수)
    }
}
