package com.designweave.patterns.creational.builder;

public class CarMain {
    public static void main(String[] args) {
        CarDirector carDirector = new CarDirector();

        CarBuilder builder = new CarBuilder();
        carDirector.bmwBuilder(builder);

        Car car = builder.build();
        System.out.println(car);
    }
}
