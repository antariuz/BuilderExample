package builder.impl;

import builder.Builder;
import model.components.ScooterColor;
import model.components.ScooterType;
import model.Scooter;

public class ScooterBuilder implements Builder {

    private String brand;
    private int wheels;
    private ScooterType scooterType;
    private ScooterColor scooterColor;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setScooterType(ScooterType scooterType) {
        this.scooterType = scooterType;
    }

    @Override
    public void setScooterColor(ScooterColor scooterColor) {
        this.scooterColor = scooterColor;
    }

    public Scooter getScooter() {
        return new Scooter(brand, wheels, scooterType, scooterColor);
    }


}
