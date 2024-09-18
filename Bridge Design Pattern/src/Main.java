import Abstraction.FishObj;
import Abstraction.HumanObj;
import Abstraction.TreeObj;
import Implementor.LandBreatheImplementor;
import Implementor.TreeBreatheImplementor;
import Implementor.WaterBreatheImplementor;

public class Main {
    public static void main(String[] args) {

        HumanObj h1 = new HumanObj(new LandBreatheImplementor());
        FishObj f1 = new FishObj(new WaterBreatheImplementor());
        TreeObj t1 = new TreeObj(new TreeBreatheImplementor());

        h1.breathe();
        f1.breathe();
        t1.breathe();

    }
}