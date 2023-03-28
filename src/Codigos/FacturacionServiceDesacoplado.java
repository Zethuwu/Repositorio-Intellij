package Codigos;

public class FacturacionServiceDesacoplado {
    private ValidacionService validacionSevice;
    private CorreoSevice correoSevice;
    private PagoService pagoService;

    public FacturacionServiceDesacoplado(ValidacionService validacionSevice, CorreoSevice correoSevice, PagoService pagoService) {
        super();
        this.validacionSevice = validacionSevice;
        this.correoSevice = correoSevice;
        this. pagoService = pagoService;
    }

    public void procesarFactura(Factura f, String email){
        validacionSevice.validarFactura(f);
        pagoService.pagarFactura(f," 111-111-111");
        correoSevice.enviarMensaje(email,"su factura con numero: " +f.getNumero() + " ha sido pagada");
    }
}
