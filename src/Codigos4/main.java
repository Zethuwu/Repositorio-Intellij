package Codigos4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String a = "Hola Mundo";
        String b = "Hola Mundo";
        String frase1= new String("hola");
        String frase2= new String("hola");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("sfd" == "sfd");
        System.out.println("ola".equals("ola"));
        System.out.println(frase1 == frase2);
        System.out.println(frase1.equals(frase2));

        int x = 5;
        Integer numero1 = Integer.valueOf(x);
        Integer numero2 = 2;

        System.out.println("hash: "+frase1.hashCode());
        System.out.println("hash: "+numero2.hashCode());
        System.out.println("hash: "+a.hashCode());

        int arreglo [] = new int[4];
        String[] arregloString = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < arregloString.length ;i++){
            arregloString[i] = sc.nextLine();
            System.out.println(arregloString[i]);
        }

        System.out.println("Que nombre quieres buscar: ");
        String search =  sc.nextLine();
        for (String lista : arregloString) {
            if(lista.equals(search)){
                System.out.println("Se encontro un nombre igual");
                break;
        }else {
            }
        }

        for (String lista : arregloString) {
           String igual =(lista == search)?"No se encontro un nombre igual":"Se encontro un nombre igual";
        }









    }

}
