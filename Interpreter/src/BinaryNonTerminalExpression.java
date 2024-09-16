public class BinaryNonTerminalExpression implements AbstractExpression{

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;
    char operator;

    @Override
    public int interpret(Context context) {

        switch (operator){
            case '+':
                return leftExpression.interpret(context)+rightExpression.interpret(context);
            case '*':

                return leftExpression.interpret(context)*rightExpression.interpret(context);

            default:return 0;

        }

    }

    public BinaryNonTerminalExpression(AbstractExpression left, AbstractExpression right, char operator){
        this.leftExpression = left;
        this.rightExpression = right;
        this.operator = operator;

    }
}
