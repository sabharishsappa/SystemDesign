public class Overloaded extends ToppingDecorator{

    BasePizza basePizza;
    public Overloaded(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int getPrice() {
        System.out.println("Extra Overloaded Cost 50 Rs.");
        return basePizza.getPrice() + 50;
    }
}
