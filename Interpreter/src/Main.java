public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        context.put("a",2);
        context.put("b",4);
        context.put("c",8);
        context.put("d",16);

        AbstractExpression expression = new BinaryNonTerminalExpression(new BinaryNonTerminalExpression(new NumberTerminalExpression("a"),new NumberTerminalExpression("b"),'*'),
                new BinaryNonTerminalExpression(new NumberTerminalExpression("c"),new NumberTerminalExpression("d"),'*'),'+');
        System.out.println(expression.interpret(context));

        AbstractExpression e1 = new MultiplyNonTerminalExpression(new SumNonTerminalExpression(new NumberTerminalExpression("a"),new NumberTerminalExpression("b")),
                new SumNonTerminalExpression(new NumberTerminalExpression("c"),new NumberTerminalExpression("d")));

        System.out.println(e1.interpret(context));


    }
}