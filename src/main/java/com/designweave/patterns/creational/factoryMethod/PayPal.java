package com.designweave.patterns.creational.factoryMethod;

public class PayPal implements PaySystem {

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing $" + amount + " via PayPal");
    }
}
