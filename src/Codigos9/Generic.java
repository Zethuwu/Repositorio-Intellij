package Codigos9;

public class Generic <T,T2,T3>{

    private T Object;
    private T2 ObjectT2;
    private T3 ObjectT3;

    public Generic(T object, T2 objectT2, T3 objectT3) {
        super();
        Object = object;
        ObjectT2 = objectT2;
        ObjectT3 = objectT3;
    }

    public void printObjectType(){
        System.out.println("El objeto con valor " + Object.toString() + " es de tipo " +Object.getClass().getName());
        System.out.println("El objeto con valor " + ObjectT2.toString() + " es de tipo " +ObjectT2.getClass().getName());
        System.out.println("El objeto con valor " + ObjectT3.toString() + " es de tipo " +ObjectT3.getClass().getName());
    }
}
