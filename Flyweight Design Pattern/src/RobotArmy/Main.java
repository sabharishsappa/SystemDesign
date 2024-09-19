package RobotArmy;

public class Main {
    public static void main(String[] args) {


        IRobot humanoidRobot = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot.display(1,2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10,30);

        IRobot roboticDog1 = RoboticFactory.createRobot("DOG");
        roboticDog1.display(2,9);


    }
}