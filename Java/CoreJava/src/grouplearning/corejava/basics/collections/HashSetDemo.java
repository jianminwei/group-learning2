package grouplearning.corejava.basics.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[]){

        /**
         * Remember HashSet is not ordered
         * HashSet keeps the set unique.
         */
        HashSet<String> set=new HashSet<>();
        set.add("Paul");
        set.add("Ram");
        set.add("Aaron");
        set.add("Leo");
        set.add("Becky");
        set.add("Leo");

        /**
         * remember collections are iterable
         */
        for(String s : set) {
            System.out.println(s);
        }

    }
}
