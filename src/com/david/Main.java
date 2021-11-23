package com.david;

import com.david.model.CandyShop;
import com.david.model.GameStore;
import com.david.model.Shop;
import com.david.model.ShopFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShopFactory shopFactory = new ShopFactory();
        Scanner scanner = new Scanner(System.in);
        Shop shop = null;

        System.out.println("Please select a store type ( C - candy shop , G - game store");
        String answer = scanner.next();

        if (  answer.equals("C") || answer.equals("G") ){
            shop = shopFactory.getShop(answer);
        }

        if ( answer.equals("C") ){
            CandyShop c = (CandyShop)shop;
        }else {
            GameStore g = (GameStore)shop;
        }
    }
}
