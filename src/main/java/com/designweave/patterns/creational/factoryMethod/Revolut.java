package com.designweave.patterns.creational.factoryMethod;

public class Revolut implements PaySystem {
    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing $" + amount + " via Revolut");
    }
}
