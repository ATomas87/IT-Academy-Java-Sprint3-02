package n2ex1;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway(PaymentMethod.PAYPAL);
        paymentGateway.pagar(new Payment() {
            @Override
            public void pagar() {
                System.out.println("Se paga mediante " + paymentGateway.getMetodoDePago());
            }
        });
        System.out.println("Pago realizado con éxito.");

        PaymentGateway paymentGateway1 = new PaymentGateway(PaymentMethod.CUENTA_BANCARIA);
        paymentGateway.pagar(new Payment() {
            @Override
            public void pagar() {
                System.out.println("Se paga mediante " + paymentGateway1.getMetodoDePago());
            }
        });
        System.out.println("Pago realizado con éxito.");

    }
}
