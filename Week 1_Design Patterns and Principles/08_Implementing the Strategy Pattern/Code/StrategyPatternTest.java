public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9101-1121"));
        context.payAmount(250.69);
        // Pay with indian PayPal
        context.setPaymentStrategy(new PayPalPayment("prathamansh@gmail.com"));
        context.payAmount(120.50);
    }
}
