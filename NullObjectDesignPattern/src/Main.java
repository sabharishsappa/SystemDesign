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

//        Eveytime we create a class and if we wanted to use their datamembers or function we need to check the
//        the passed object is null or not, so that would be difficult everytime we do that, so we create Null object
//        if some issue or error is there it will return null object which has the default or empty behaviour

        System.out.println(car.getFuelCapacity());
        System.out.println(car.getSeatingCapacity());

        System.out.println(byke.getFuelCapacity());
        System.out.println(byke.getSeatingCapacity());

        System.out.println(sportsCar.getSeatingCapacity());
            System.out.println(sportsCar.getFuelCapacity());

    }
}