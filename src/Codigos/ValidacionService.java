package Codigos;

public class ValidacionService {
    public boolean validarFactura(Factura f){
        if(f.getImporte() < 100){
            System.out.println("factura valida");
            return true;
        } else{
            return false;
        }
    }
}
