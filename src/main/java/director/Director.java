package director;

import builder.Builder;
import model.components.ScooterColor;
import model.components.ScooterType;

public class Director {

    public void constructToyotaScooter(Builder builder) {
        builder.setBrand("TOYOTA");
        builder.setWheels(4);
        builder.setScooterType(ScooterType.Electrical);
        builder.setScooterColor(ScooterColor.Blue);
    }

    public void constructBlackMamba(Builder builder) {
        builder.setBrand("MAMBA");
        builder.setWheels(2);
        builder.setScooterType(ScooterType.Mechanical);
        builder.setScooterColor(ScooterColor.Black);
    }

}
