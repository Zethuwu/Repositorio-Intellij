package Codigos2;

public class Andres extends Persona{

    public Andres(String nombre, int edad, int estatura,String colorfav, String nacimiento) {
        super(nombre, edad, estatura, colorfav, nacimiento);
    }
    //Diferente enunciado en gustos

    @Override
    public void Gustos() {
        System.out.println("Le gusta jugar futbol e impresionar a las nenas");
    }
}
