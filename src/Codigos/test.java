package Codigos;

public class test {
    public static void main(String[] args) {

        FacturacionServiceAcoplado fsa = new FacturacionServiceAcoplado(new ValidacionService(), new CorreoSevice(), new PagoService());

        Factura factura = new Factura(10, "pantalon", 90);

        fsa.procesarFactura(factura, "admin@admin.com");
    }
}
