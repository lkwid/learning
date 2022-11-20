package structural.adapter.assignment;

public class PaymentApp {

    public static void main(String[] args) {
        PaymentAdapter adapter = new PaymentAdapter();
        adapter.payInPln(40);
    }

}
