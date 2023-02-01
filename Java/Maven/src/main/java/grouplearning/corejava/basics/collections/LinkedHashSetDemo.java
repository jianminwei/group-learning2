package grouplearning.corejava.basics.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String args[]){

        /**
         * Remember LinkedHashSet is  ordered
         */
        LinkedHashSet<String> set=new LinkedHashSet<>();
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
