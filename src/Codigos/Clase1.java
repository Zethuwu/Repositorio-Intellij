package Codigos;


import java.util.Random;

import static Codigos.Pelota.impresion;

public class Clase1{
    // constructor de la clase

    public Clase1(){

    }

    String lb;
    double dou;
    public static void main(String[] args) {
        // crear el random
        Random rd = new Random();
        rd.nextInt(10);
        // numero random de 1 a 10
        int r = rd.nextInt(10) + 1;
        numero(r);

        Pelota pelota = new Pelota();
        pelota.setMaterial("platico");
        pelota.color = "azul";
        pelota.setTamano("Grande");
        System.out.println("Material: ["+pelota.getMaterial()+"] - "+ "Color: [" +pelota.getColor() + "] - "
                + "Tamaño: [" + pelota.getTamano() +"] ");

        impresion();

    }


    public static void numero(int a) {
      if(a == 8){
          System.out.println("ganaste");
        }else{
          System.out.println("perdiste");
      }
    }
}
