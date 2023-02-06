package grouplearning.corejava.basics.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> fruits  = new LinkedList<>();
        fruits.add("Apple"); //["Apple"]
        fruits.add("Orange"); //["Apple", "Orange"]

        //inserting element at first position
        fruits.add(0, "Banana"); //["Banana", "Apple", "Orange"]

        System.out.println("LinkedList elements: ");

        /**
         * Remember java collections are iterable,
         * you can use foreach loop.
         */
        for(String s : fruits) {
            System.out.println(s);
        }

        /**
         * traditional for loop
         */

//        for (int i = 0; i < fruits.size(); i++) {
//            System.out.println(fruits.get(i));
//        }



        /**
         * You can use pop() to access the elements
         * if you just use the list once
         */
//        while (fruits.size() > 0) {
//            System.out.println(fruits.pop());
//        }

    }
}
