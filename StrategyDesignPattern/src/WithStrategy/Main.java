package WithStrategy;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add( new OffRoadVehicle());
        vehicles.add( new PassengerVehicle());
        vehicles.add( new SportsVehicle());
        vehicles.add( new GoodsVehicle());




        for (var x: vehicles)
            x.drive();

    }
}
