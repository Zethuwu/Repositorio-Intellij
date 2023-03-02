package Codigos2;

public class Juan extends Persona {
    public Juan(String nombre, int edad, int estatura,String colorfav,String nacimiento) {
        super(nombre, edad, estatura, colorfav ,nacimiento);
    }
    //Diferente enunciado en gustos
    @Override
    public void Gustos() {
        System.out.println("Es demasiado timido para hacer algo por su cuenta pero le encantan los videojuegos");
    }
}
