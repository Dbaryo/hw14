package com.david.model;

public abstract class Business {
    public Business(Person owner, float cashInRegister) {
        this.owner = owner;
        this.cashInRegister = cashInRegister;
    }

    protected Person owner;
    protected float cashInRegister;

    public abstract float  payTaxes(Shop s1);

    public int taxPercentage (){
        return 50;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public float getcashInRegister() {
        return cashInRegister;
    }

    public void setcashInRegister(float cashInRegister) {
        this.cashInRegister = cashInRegister;
    }
}
