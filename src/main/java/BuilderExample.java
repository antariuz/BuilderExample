import builder.Builder;
import builder.impl.ScooterBuilder;
import director.Director;
import model.Scooter;
import model.components.ScooterColor;
import model.components.ScooterType;

public class BuilderExample {
    public static void main(String[] args) {
        Builder builder = new ScooterBuilder();
        Director director = new Director();

        builder.setBrand("MONSTER");
        builder.setWheels(1);
        builder.setScooterType(ScooterType.Electrical);
        builder.setScooterColor(ScooterColor.Invisible);
        Scooter scooter1 = builder.getScooter();
        System.out.println(scooter1);


        director.constructToyotaScooter(builder);
        Scooter scooter2 = builder.getScooter();
        System.out.println(scooter2);

        director.constructBlackMamba(builder);
        Scooter scooter3 = builder.getScooter();
        System.out.println(scooter3);



    }
}
