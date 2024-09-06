package WithStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){
        super(new WithStrategy.SpecialDriveStrategy());
    }

}
