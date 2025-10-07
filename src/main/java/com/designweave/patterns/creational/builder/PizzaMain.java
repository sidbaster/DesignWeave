package com.designweave.patterns.creational.builder;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(true).seafood(true).build();
    }
}
