package WithStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(){
        super(new WithStrategy.SpecialDriveStrategy());
    }
}
