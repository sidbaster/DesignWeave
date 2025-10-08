package com.designweave.patterns.creational.factoryMethod;

public class Chicken implements Product {
    @Override
    public void cooking() {
        System.out.println("Chicken cooking");
    }
}
