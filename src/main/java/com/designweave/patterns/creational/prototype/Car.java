package com.designweave.patterns.creational.prototype;

public class Car implements Cloneable {
    private static final Car TRUCK_CAR = new Car("Truck","default", "default");
    private static final Car AUTOMOBILE_CAR = new Car("Automobile","default", "default");
    private static final Car MINI_CAR = new Car("Mini","default", "default");

    private final String type;
    private String color;
    private String number;


    private Car(String type, String color, String number) {
        this.type = type;
        this.color = color;
        this.number = number;
    }

    public Car createTruck(String color, String number) {
        Car truck = TRUCK_CAR.clone();

        truck.setColor(color);
        truck.setNumber(number);

        return truck;
    }

    public Car createAutomobile(String color, String number) {
        Car automobile = AUTOMOBILE_CAR.clone();

        automobile.setColor(color);
        automobile.setNumber(number);

        return automobile;
    }

    public Car createMiniCar(String color, String number) {
        Car mini = MINI_CAR.clone();

        mini.setColor(color);
        mini.setNumber(number);

        return mini;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    protected Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
