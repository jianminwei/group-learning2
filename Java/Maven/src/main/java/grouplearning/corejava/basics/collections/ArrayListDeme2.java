package grouplearning.corejava.basics.collections;

import java.util.ArrayList;

public class ArrayListDeme2 {

    public static void main(String[] args) {
        ArrayList<Integer> ilist = new ArrayList<>();

        ilist.add(1); // int -- Integer; float -- Float; double -- Double
        ilist.add(2);
        ilist.add(3);


//        for (Integer i : ilist) {
//            System.out.println(i);
//        }

        // Unboxing to int
        for (int i : ilist) {
            System.out.println(i);
        }

        ilist.stream().forEach( (a) -> {
            System.out.println(a);
        } );

    }
}
