package WithStrategy;

import WithStrategy.DriveStrategy.DriveStrategy;

public class Vehicle{

    DriveStrategy driveStrategy;


//    which takes the Drive Strategy as the object from the derived class based on the requirement
//    Special Drive strategy or Normal Drive Strategy, so we should not initialise earlier.


    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;

    }

    public void drive(){
        driveStrategy.drive();
    }


}
