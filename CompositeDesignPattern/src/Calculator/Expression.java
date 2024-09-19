package Calculator;


public class Expression implements ArithmeticExpression{

    ArithmeticExpression left;
    ArithmeticExpression right;
    Operation operation;


    public Expression(ArithmeticExpression left, ArithmeticExpression right, Operation operation){
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int evaluate() {

        int value;
        switch (operation){
            case ADD:
                value = left.evaluate() + right.evaluate();
                break;
            case SUBTRACT:
                value = left.evaluate() - right.evaluate();
                break;
            case MULTIPLY:
                value = left.evaluate() * right.evaluate();
                break;
            case DIVIDE:
                value = left.evaluate() / right.evaluate();
                break;
            default:
                return -1;

        }

        return value;
    }
}
