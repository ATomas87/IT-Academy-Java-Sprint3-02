package n2ex1;

public class PaymentGateway {

    private PaymentMethod paymentMethod;

    public PaymentGateway(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getMetodoDePago(){
        return this.paymentMethod;
    }
    public void pay(Payment payment){
        System.out.println("Iniciando pago...");
        payment.pay();
    }
}
