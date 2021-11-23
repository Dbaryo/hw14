package com.david.model;

public class ShopFactory {

    public Shop getShop(String shopType){

        CandyShop newCandyShop = null;
        GameStore newGameStore = null;

        if ( shopType.equals( "C")){
            return newCandyShop;
        }else if ( shopType.equals( "G")){
            return newGameStore;
        }else return null;
    }
}
