 public class Main {
    public static void main(String[] args) {

        Vehicle byke = VehicleFactory.getVehicleObject("BYKE");
        Vehicle car = VehicleFactory.getVehicleObject("Car");
        Vehicle sportsCar = VehicleFactory.getVehicleObject("SportsCar");

//        without Null Object Pattern
//        if(sportsCar !=null){
//            System.out.println(sportsCar.getSeatingCapacity());
//            System.out.println(sportsCar.getFuelCapacity());
//        }

        System.out.println(car.getFuelCapacity());
        System.out.println(car.getSeatingCapacity());

        System.out.println(byke.getFuelCapacity());
        System.out.println(byke.getSeatingCapacity());

        System.out.println(sportsCar.getSeatingCapacity());
            System.out.println(sportsCar.getFuelCapacity());

    }
}