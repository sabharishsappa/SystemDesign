package WithStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new WithStrategy.NormalDriveStrategy());
    }


}
