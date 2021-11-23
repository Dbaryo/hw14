package com.david.model;

public class Item {
    public Item(String itemName, float itemPrice, int inventory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.inventory = inventory;
    }

    private String itemName;
    private float itemPrice;
    private int inventory;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", inventory=" + inventory +
                '}';
    }
}


