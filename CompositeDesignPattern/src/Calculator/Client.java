package Calculator;

public class Client {

    public static void main(String[] args) {

        Number two = new Number(2);
        Number seven = new Number(7);
        Number one = new Number(1);

        Expression right = new Expression(seven,one,Operation.ADD);

        Expression left = new Expression(two,right,Operation.MULTIPLY);

        System.out.println(left.evaluate());
    }
}
