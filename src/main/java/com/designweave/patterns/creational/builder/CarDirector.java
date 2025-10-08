package com.designweave.patterns.creational.builder;

public class CarDirector {

    public void bmwBuilder(CarBuilder builder) {
        builder.model("BMW")
                .manufacturer("BMW");
    }

    public void lamborginingBuilder(CarBuilder builder) {
        builder.model("Lamborgining")
                .manufacturer("Lamborgining");
    }
}
