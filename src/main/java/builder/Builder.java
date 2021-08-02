package builder;

import model.components.ScooterColor;
import model.components.ScooterType;
import model.Scooter;

public interface Builder {
    void setBrand(String brand);
    void setWheels(int wheels);
    void setScooterType(ScooterType scooterType);
    void setScooterColor(ScooterColor scooterColor);
    Scooter getScooter();
}
