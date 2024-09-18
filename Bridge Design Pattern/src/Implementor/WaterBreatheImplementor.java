package Implementor;

public class WaterBreatheImplementor implements BreatheImplementor{

    @Override
    public void breathe() {
        System.out.println("Breathes through Gills \nInhales Oxygen from water and exhales CO2");
    }
}
