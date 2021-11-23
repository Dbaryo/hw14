package com.david.model;

public class CandyShop extends Shop{
    public CandyShop(Person owner, float cashInRegister, Person manager, Person cashier, boolean isClosed, Item[] candies) {
        super(owner, cashInRegister, manager, cashier, isClosed);
        this.candies = candies;
    }

    private Item[] candies;

    public Item [] purchaseItem( Item[] candies, String purchasedItemName, Person p1 ){
        int i = isAvailable(candies, purchasedItemName);
        if (i < candies.length ){
            if (isEnoughMoney(candies, i, p1)){
                candies[i].setInventory(candies[i].getInventory() - 1);
                p1.setAmountOfMoney( p1.getAmountOfMoney() - candies[i].getItemPrice());
                setCashInRegister( getCashInRegister() + candies[i].getItemPrice());
            }else {
                System.out.println("Sorry, you don't have enough money to buy this candy.");
            }
        }else {
            System.out.println("Sorry, " + purchasedItemName + "is not available in "
                    + getManager() + "'s Candy shop.");
        }return candies;
    }

    public Item[] getCandies() {
        return candies;
    }

    public void setCandies(Item[] candies) {
        this.candies = candies;
    }

    @Override
    public int taxPercentage() {
        return 10;
    }

    @Override
    public float payTaxes(Shop s1) {
        return ( (cashInRegister * taxPercentage()) / 100 );
    }
}
