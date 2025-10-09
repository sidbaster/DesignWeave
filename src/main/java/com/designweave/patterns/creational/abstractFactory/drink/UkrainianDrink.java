package com.designweave.patterns.creational.abstractFactory.drink;

public class UkrainianDrink implements Drink {
    @Override
    public void pour() {
        System.out.println("pour vodka");
    }
}
