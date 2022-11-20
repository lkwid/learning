package structural.adapter.assignment;

public class PaymentAdapter {

    public void payInPln(int pln) {
        int amountInUsd = Integer.divideUnsigned(pln, 4);

        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        paymentProcessor.pay(amountInUsd);
    }
}
