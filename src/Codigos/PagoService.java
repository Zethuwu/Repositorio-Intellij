package Codigos;

public class PagoService {
    public void pagarFactura(Factura f, String cuenta){
        System.out.println("pago a la cuenta" + cuenta);
        System.out.println("Importe a pagar: "+f.getImporte());
    }
}
