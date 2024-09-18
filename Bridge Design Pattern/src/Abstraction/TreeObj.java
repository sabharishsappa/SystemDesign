package Abstraction;

import Implementor.BreatheImplementor;

public class TreeObj extends LivingThing {

    public TreeObj(BreatheImplementor breatheImplementor)
    {
        super(breatheImplementor);
    }


    @Override
    public void breathe() {

        breatheImplementor.breathe();

    }
}
