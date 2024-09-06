package WithStrategy;

import WithStrategy.DriveStrategy.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("SpecialDrive Strategy");
    }
}
