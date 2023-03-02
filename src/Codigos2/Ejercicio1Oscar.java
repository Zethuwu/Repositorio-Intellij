package Codigos2;

//Main para hacer las pruebas de las clases hechas
public class Ejercicio1Oscar {
    public static void main(String[] args) {
        //Ejemplo heredar
        Estudiante universitario = new Estudiante("Carlos",20,176,"19/05/2002",
                "azul","Universidad","Unam");

        System.out.println(universitario);
        //Ejemplo polimorfismo
        Andres andres = new Andres("Andres",19,180,"negro","25/08/2003");
        System.out.println("Andres: ");andres.Gustos();
        Juan juan = new Juan("Juan",16,160,"rosa","9/08/2006");
        System.out.println("Juan: ");juan.Gustos();
        //Ejemplo encapsulamiento
        System.out.println("Colorfav de Carlos :"+universitario.getColorfav());
        universitario.setColorfav("morado");
        System.out.println("Colorfav de Carlos :"+universitario.getColorfav());
        //Ejemplo abstracto
        InstanciaAbstrac classabs = new InstanciaAbstrac("Saul",26,175,"06/01/1997","Azul marqueza");
        System.out.println("Personalidad de " +classabs.getNombre()+": ");classabs.Personalidad();
        System.out.println(classabs.getEstatura());

    }


}
