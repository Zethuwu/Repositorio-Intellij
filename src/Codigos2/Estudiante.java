package Codigos2;
// Usamos extends para heredar la clase padre y obtener sus variables y metodos
public class Estudiante extends Persona{

    private String nivelDeEstudios;
    private String universidad;

    //Creando el constructor con super para llamar al constructor de la clase padre
    // (esto solo si el constructor de la clase padre tenga parametros de entrda)

    public Estudiante(String nombre, int edad, int estatura, String nacimiento,String colorfav, String nivelDeEstudios, String universidad) {
        super(nombre, edad, estatura, nacimiento,colorfav);
        this.nivelDeEstudios = nivelDeEstudios;
        this.universidad = universidad;
    }

    public String getNivelDeEstudios() {
        return nivelDeEstudios;
    }

    public void setNivelDeEstudios(String nivelDeEstudios) {
        this.nivelDeEstudios = nivelDeEstudios;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }


    //Impresion de lo que tenga el objeto

    @Override
    public String toString() {
        return "Estudiante{" +
                "nivelDeEstudios='" + nivelDeEstudios + '\'' +
                ", universidad='" + universidad + '\'' +
                "} " + super.toString();
    }


}
