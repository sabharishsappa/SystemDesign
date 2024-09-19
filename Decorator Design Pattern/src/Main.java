public class Main {
    public static void main(String[] args) {


        BasePizza pizza1 = new Overloaded(new Mushroom(new ExtraCheese(new Margherita())));
        BasePizza pizza2 = new ExtraCheese(new VegDelight());
        BasePizza pizza3 = new ExtraCheese(new Overloaded(new FarmHouse()));

        System.out.println(pizza1.getPrice());
        System.out.println();
        System.out.println(pizza2.getPrice());
        System.out.println();
        System.out.println(pizza3.getPrice());

    }
}