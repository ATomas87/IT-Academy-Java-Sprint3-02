package n2ex1;

public class Main {
    public static void main(String[] args) {
        Pasarela pasarela = new Pasarela(MetodoDePago.PAYPAL);
        pasarela.pagar(new Pago() {
            @Override
            public void pagar() {
                System.out.println("Se paga mediante " + pasarela.getMetodoDePago());
            }
        });
        System.out.println("Pago realizado con éxito.");

        Pasarela pasarela1 = new Pasarela(MetodoDePago.CUENTA_BANCARIA);
        pasarela.pagar(new Pago() {
            @Override
            public void pagar() {
                System.out.println("Se paga mediante " + pasarela1.getMetodoDePago());
            }
        });
        System.out.println("Pago realizado con éxito.");

    }
}
