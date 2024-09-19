public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        System.out.println("Extra Mushroom Cost 15 Rs.");
        return basePizza.getPrice()+15;
    }
}
