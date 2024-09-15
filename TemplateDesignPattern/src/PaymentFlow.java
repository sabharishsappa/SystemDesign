public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void debitMoney();
    public abstract void calculateFees();
    public abstract void creditMoney();



//    This is the template Method where all classes will follow specific steps in specific order but they have their own execution for the
//    for each specific task
    public final void sendMoney(){

        validateRequest();
        debitMoney();
        calculateFees();
        creditMoney();

    }



}
