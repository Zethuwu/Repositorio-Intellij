package Codigos2;
// Heredaremos la clase abstracta para que se pueda instanciar por medio de esta clase
public class InstanciaAbstrac extends PersonaAbstracta{
    public InstanciaAbstrac(String nombre, int edad, int estatura, String nacimiento, String colorfav) {
        super(nombre, edad, estatura, nacimiento, colorfav);
    }

    @Override
    public void Personalidad() {
        System.out.println("Gustos abstractos sobre el arte y lectura");
    }
}
