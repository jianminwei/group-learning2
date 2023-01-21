package grouplearning.corejava.basics.exceptions;

import grouplearning.corejava.basics.classes.Cat;

public class Exception1 {
    public static void main(String[] args) {
        int [] arr = new int[3];

        arr[0] = 10; arr[1] = 20; arr[2] = 30;

        //System.out.println(arr[5]); //This will throw a runtime exception, java.lang.ArrayIndexOutOfBoundsException

        Cat [] cats = new Cat[3];

        System.out.println(cats[0].getName());  //This will get a java.lang.NullPointerException

    }
}
