package n2ex1;

public class Pasarela {

    private MetodoDePago metodoDePago;

    public Pasarela(MetodoDePago metodoDePago){
        this.metodoDePago = metodoDePago;
    }

    public MetodoDePago getMetodoDePago(){
        return this.metodoDePago;
    }
    public void pagar(Pago pago){
        System.out.println("Iniciando pago...");
        pago.pagar();
    }
}
