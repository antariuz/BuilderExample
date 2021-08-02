package model;

import model.components.ScooterColor;
import model.components.ScooterType;

public class Scooter {

    private final String brand;
    private final int wheels;
    private final ScooterType scooterType;
    private final ScooterColor scooterColor;

    public Scooter(String brand, int wheels, ScooterType scooterType, ScooterColor scooterColor) {
        this.brand = brand;
        this.wheels = wheels;
        this.scooterType = scooterType;
        this.scooterColor = scooterColor;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public ScooterType getType() {
        return scooterType;
    }

    public ScooterColor getColor() {
        return scooterColor;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", Type=" + scooterType +
                ", Color=" + scooterColor +
                '}';
    }
}
