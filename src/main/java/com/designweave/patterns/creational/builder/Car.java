package com.designweave.patterns.creational.builder;

import java.util.UUID;

public class Car {
    private final UUID id;
    private final String model;
    private final String manufacturer;
    private final String color;
    private final Double price;
    private final Double fuel;
    private final Double fuelConsumption;


    public Car(UUID id, String model, String manufacturer, String color, Double price, Double fuel, Double fuelConsumption) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", fuel=" + fuel +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
