package WithStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(){
        super(new WithStrategy.SpecialDriveStrategy());
    }

}
