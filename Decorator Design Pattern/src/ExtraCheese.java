public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        System.out.println("Extra Cheese Cost 10 Rs.");
        return basePizza.getPrice()+10;
    }
}
