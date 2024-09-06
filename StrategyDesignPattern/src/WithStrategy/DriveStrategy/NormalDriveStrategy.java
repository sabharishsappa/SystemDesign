package WithStrategy;

import WithStrategy.DriveStrategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("NormalDriveStrategy");
    }
}
