import Adaptee.WeightMachine;
import Adaptee.WeightMachineForBabies;
import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {

        WeightMachineAdapter wmAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());

        double weightInKgs = wmAdapter.getWeightInKgs();

        System.out.println(weightInKgs);

    }
}