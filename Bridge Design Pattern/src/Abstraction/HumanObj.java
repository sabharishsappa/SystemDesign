package Abstraction;

import Implementor.BreatheImplementor;

public class HumanObj extends LivingThing{

    public HumanObj(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
