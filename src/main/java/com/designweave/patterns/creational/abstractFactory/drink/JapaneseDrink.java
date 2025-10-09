package com.designweave.patterns.creational.abstractFactory.drink;

public class JapaneseDrink implements Drink {
    @Override
    public void pour() {
        System.out.println("pour sake");
    }
}
