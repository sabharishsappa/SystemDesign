public class PayToFriend extends  PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Pay to Friend Payment request Validated");
    }

    @Override
    public void creditMoney() {
        System.out.println("Credit Money functionality of Pay to Friend");

    }

    @Override
    public void calculateFees() {

        System.out.println("Calculation Logic of Pay to Friend");

    }

    @Override
    public void debitMoney() {
        System.out.println("Debit Money functionality of Pay to Friend");

    }
}
