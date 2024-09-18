package Abstraction;

import Implementor.BreatheImplementor;

public class FishObj extends LivingThing{

    public FishObj(BreatheImplementor breatheImplementor)
    {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
