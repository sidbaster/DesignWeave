package com.designweave.patterns.creational.factoryMethod;

public class PastaCookingFactory extends CookingOven {
    @Override
    public Product createProduct() {
        return new Pasta();
    }
}
