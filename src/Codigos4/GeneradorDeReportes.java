package Codigos4;

import java.util.List;

public class GeneradorDeReportes {

    private ObtenedorDeDatos obtenedorDeDatos;

    public GeneradorDeReportes(ObtenedorDeDatos obtenedorDeDatos){
        this.obtenedorDeDatos = obtenedorDeDatos;
    }

    public void generarReport(){

        List<Dato> datosObtenidos = obtenedorDeDatos.obtenerDatos();
    }
}
