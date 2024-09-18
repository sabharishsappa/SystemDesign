package Implementor;

public class LandBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathes through Lungs \nInhales Oxygen and Exhales CO2");
    }
}
