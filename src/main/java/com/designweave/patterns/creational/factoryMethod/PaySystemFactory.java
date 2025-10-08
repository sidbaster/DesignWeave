package com.designweave.patterns.creational.factoryMethod;

public class PaySystemFactory {
    public PaySystem createPayPal() {
        return new PayPal();
    }

    public PaySystem createRevolut() {
        return new Revolut();
    }
}
