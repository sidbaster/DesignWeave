package com.designweave.patterns.creational.factoryMethod;

/*Clear implementation of this pattern*/
public class CookingOvenMain {
    public static void main(String[] args) {
        CookingOven cookingOven = new ChickenCookingFactory();

        Product product = cookingOven.createProduct();
    }
}
