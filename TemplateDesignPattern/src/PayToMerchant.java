public class PayToMerchant extends PaymentFlow {

    @Override
    public void calculateFees() {
        System.out.println("Calculation Logic of Pay to Merchant");
    }

    @Override
    public void creditMoney() {
        System.out.println("Credit Money Logic of Pay to Merchant");

    }

    @Override
    public void debitMoney() {
        System.out.println("Debit Money Logic of Pay to Friend");

    }

    @Override
    public void validateRequest() {
        System.out.println("Pay to friend Request validated successfully");
    }



}
