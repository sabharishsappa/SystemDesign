import java.util.Locale;

public class VehicleFactory {


    public static Vehicle getVehicleObject(String typeOfVehicle){
        if(typeOfVehicle.equalsIgnoreCase("byke")){
            return new Byke();
        }

        else if(typeOfVehicle.equalsIgnoreCase("car")){
            return new Car();
        }

        return new NullVehicle();
    }

}
