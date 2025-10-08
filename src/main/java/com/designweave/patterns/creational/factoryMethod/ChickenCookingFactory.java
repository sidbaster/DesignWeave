package com.designweave.patterns.creational.factoryMethod;

public class ChickenCookingFactory extends CookingOven {
    @Override
    Product createProduct() {
        return new Chicken();
    }
}
