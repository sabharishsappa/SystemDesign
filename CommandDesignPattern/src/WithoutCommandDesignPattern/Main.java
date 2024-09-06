package WithoutCommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAc();

        ac.setTemperature(23);
        ac.turnOffAc();
    }
}
