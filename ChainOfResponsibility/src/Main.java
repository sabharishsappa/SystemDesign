public class Main {
    public static void main(String[] args) {


        LogProcessor lp = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        lp.log(lp.ERROR,"Exception Happens");
        lp.log(lp.DEBUG,"Need to Debug this");
        lp.log(lp.INFO,"Just for Info");


    }
}