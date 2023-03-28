package Codigos8;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = (x, y) ->{
            //suma
            int resultado = x + y;
            //multiplicacion
            int resultadomul = x*y;
            //resta
            int resultadores = x-y;
            //division
            int resultadodiv = x/y;

            System.out.println("La suma es igual a: " + resultado);
            System.out.println("La multiplicacion es igual a: " + resultadomul);
            System.out.println("La resta es igual a: " + resultadores);
            System.out.println("La division es igual a: " + resultadodiv);
        };
        calculadora.operacionDosNumeros(10,10);

    }

}
