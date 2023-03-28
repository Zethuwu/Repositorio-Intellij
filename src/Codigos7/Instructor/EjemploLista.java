package Codigos7.Instructor;


import java.util.*;

public class EjemploLista {
    public static void main(String[] args) {
        List listaNueva = new LinkedList();
        List <String> listaArrayList = new ArrayList<>();
        List <String> listString = new ArrayList<>();
        List <Perro> listPerro = new ArrayList<>();
        Set <String > listaArrayListset = new HashSet<>();
        Map <String ,String> listaArrayMap = new HashMap<>();
        listaArrayList.add("Ricardo");
        listaArrayList.add("Alexis");
        listaArrayList.add("Mauricio");
        listaArrayListset.add("Ricardo");
        listaArrayListset.add("Alexis");
        listaArrayListset.add("Mauricio");
        listaArrayListset.add("Alexis");
        listaArrayMap.put("5","Color verde");
        listaArrayMap.put("6","Color rojo");

        if(listaArrayList != null){
            if(listaArrayList.isEmpty()){
                System.out.println("Lista vacia");
            }else{
                System.out.println("Lista con valores");
                for (int i = 0; i < listaArrayList.size();i++){
                    System.out.println(listaArrayList.get(i));
                }
                System.out.println();
                for (String a:listaArrayList) {
                    System.out.println(a);
                }
                System.out.println();
                listaArrayList.stream().forEach(n -> System.out.println(n));
                System.out.println();
                listaArrayListset.stream().forEach(n -> System.out.println(n));

            }
        }else{
            System.out.println("Lista nula");
        }

     //   System.out.println(listaArrayList);
     //   System.out.println(listString);
    }
    List obtenerDatos(){
        List listaArrayList = null;
        //Consulta a un servicio REST = null, []
        return listaArrayList;
    }
    List obtenerEdades(){
        return new ArrayList<>();
    }
}

class Perro{

}
