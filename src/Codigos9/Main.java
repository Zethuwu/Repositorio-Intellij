package Codigos9;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

       // Generic<Integer> g = new Generic<Integer>(20);
       // Generic<Boolean> gb = new Generic<Boolean>(true);
        Generic<Integer, Boolean, String> g = new Generic<Integer, Boolean, String>(20,false,"ola uwu");

        g.printObjectType();

        //HashMap<K,V>
    }
}
