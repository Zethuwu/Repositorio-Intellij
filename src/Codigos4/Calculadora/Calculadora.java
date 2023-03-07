package Codigos4.Calculadora;

public class Calculadora {

    private Suma suma;
    private Multiplicacion multiplicacion;
    private Resta resta;
    private Division division;

    public Calculadora(Suma suma) {
        this.suma = suma;
    }
    public Calculadora(Multiplicacion multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public Calculadora(Resta resta) {
        this.resta = resta;
    }

    public Calculadora(Division division) {
        this.division = division;
    }

    public void sumada(int num1, int num2){
        suma.hacerSuma(num1,num2);
    }
    public void restada(int num1, int num2){
        resta.hacerResta(num1,num2);
    }
    public void multipliacionite(int num1, int num2){
        multiplicacion.hacerMultiplicacion(num1,num2);
    }
    public void divisionite(int num1, int num2){
        division.hacerDivision(num1,num2);
    }

}
