package grouplearning.corejava.basics.exceptions;

import grouplearning.corejava.basics.classes.Cat;

public class Exception1 {
    public static void main(String[] args) {
        int [] arr = new int[3];

        arr[0] = 10; arr[1] = 20; arr[2] = 30;

        //System.out.println(arr[5]); //This will throw a runtime exception, java.lang.ArrayIndexOutOfBoundsException

        Cat [] cats = new Cat[3];
        Cat c1 = new Cat(); c1.setName("Grey Ball");
        Cat c2 = new Cat(); c2.setName("Grey Ball2");
        Cat c3 = new Cat(); c3.setName("Grey Ball3");

        cats[0] = c1; cats[1] = c2; cats[2] = c3;

        System.out.println(cats[0].getName());  //This will get a java.lang.NullPointerException

    }
}
