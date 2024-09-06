package WithoutCommandDesignPattern;

public class AirConditioner {

    boolean isOn =false;
    int temperature;

    public void turnOnAc(){
        isOn = true;
        System.out.println("AC turned on");
    }

    public void turnOffAc(){
        isOn = false;
        System.out.println("AC turned off");
    }

    public void setTemperature(int temperature) {
            this.temperature = temperature;
        System.out.println("Temperature set to "+temperature);
    }
}
