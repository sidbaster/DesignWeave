package com.designweave.patterns.creational.builder;

import java.util.UUID;

public class CarBuilder {
    private  UUID id;
    private  String model;
    private  String manufacturer;
    private  String color;
    private  Double price;
    private  Double fuel;
    private  Double fuelConsumption;

    public CarBuilder id(UUID id) {
        this.id = id;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }
    public CarBuilder price(Double price) {
        this.price = price;
        return this;
    }
    public CarBuilder fuel(Double fuel) {
        this.fuel = fuel;
        return this;
    }

    public CarBuilder fuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public Car build() {
        return new Car(id, model, manufacturer, color, price, fuel, fuelConsumption);
    }
}
