package com.david.model;

public class Person {

    public Person(String name, char sex, int age, float amountOfMoney) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.amountOfMoney = amountOfMoney;
    }

    private String name;
    private final char sex;
    private int age;
    private float amountOfMoney;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(float amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }


}
