package com.david.model;

import java.util.Objects;

public abstract class Shop extends Business {

    public Shop(Person owner, float cashInRegister, Person manager, Person cashier, boolean isClosed) {
        super(owner, cashInRegister);
        this.manager = manager;
        this.cashier = cashier;
        this.isClosed = isClosed;
    }

    protected Person manager;
    protected Person cashier;
    protected boolean isClosed = true;


    public abstract Item [] purchaseItem( Item[] itemList, String purchasedItemName, Person p1 );

    public int isAvailable (Item[] itemList, String wantedItemName ){
        for (int i = 0; i < itemList.length; i++) {
            if( (Objects.equals(wantedItemName, itemList[i].getItemName())) && ( itemList[i].getInventory() > 0 )){
                return i;
            }
        } return itemList.length + 10;
    }

    public boolean isEnoughMoney (Item[] itemList, int i, Person p1 ){
        if (p1.getAmountOfMoney() >= itemList[i].getItemPrice()){ return true;}
        else {return false;}
    }

    public static Shop whichIsMoreSuccessful(Shop s1, Shop s2){
        Shop mostSuccessful = s1;
        if ( s1.getCashInRegister() > s2.getCashInRegister() ){
            System.out.println("The more successful store is: " + s1.manager + "'s shop!");
        }else {
            mostSuccessful = s2;
            System.out.println("The more successful store is: " + s2.manager + "'s shop!");
        }return mostSuccessful;
    }

        public boolean close( boolean isClosed){
        return true;
    }

    public boolean open( boolean isClosed){
        return false;
    }



    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    public Person getCashier() {
        return cashier;
    }

    public void setCashier(Person cashier) {
        this.cashier = cashier;
    }

    public float getCashInRegister() {
        return cashInRegister;
    }

    public void setCashInRegister(float cashInRegister) {
        this.cashInRegister = cashInRegister;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
