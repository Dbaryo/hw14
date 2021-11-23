package com.david.model;

public class GameStore extends Shop{
    public GameStore(Person owner, float cashInRegister, Person manager, Person cashier, boolean isClosed, Item[] gamesList) {
        super(owner, cashInRegister, manager, cashier, isClosed);
        this.gamesList = gamesList;
    }

    private Item [] gamesList;

    @Override
    public Item[] purchaseItem(Item[] gameList, String purchasedItemName, Person p1) {
        int i = isAvailable(gameList, purchasedItemName);
        if (i < gameList.length ){
            if (isEnoughMoney(gameList, i, p1)){
                gameList[i].setInventory(gameList[i].getInventory() - 1);
                p1.setAmountOfMoney( p1.getAmountOfMoney() - gameList[i].getItemPrice());
                setCashInRegister( getCashInRegister() + gameList[i].getItemPrice());
            }else {
                System.out.println("Sorry, you don't have enough money to buy this game.");
            }
        }else {
            System.out.println("Sorry, " + purchasedItemName + "is not available in "
            + getManager() + "'s Game store.");
        }return gameList;
    }

    @Override
    public int taxPercentage() {
        return 15;
    }

    @Override
    public float payTaxes(Shop s1) {
        return ( (cashInRegister * taxPercentage()) / 100 );
    }


}

