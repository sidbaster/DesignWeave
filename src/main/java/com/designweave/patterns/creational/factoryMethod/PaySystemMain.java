package com.designweave.patterns.creational.factoryMethod;

/*
Simple factory realization
*/
public class PaySystemMain {
    public static void main(String[] args) {
        PaySystemFactory paySystemFactory = new PaySystemFactory();

        PaySystem payPal = paySystemFactory.createPayPal();

        PaySystem revolut = paySystemFactory.createRevolut();
    }
}
