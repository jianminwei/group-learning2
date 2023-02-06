package grouplearning.corejava.basics.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[]){
        //creating ArrayList of string type
        ArrayList<String> cats=new ArrayList<>();

        //adding few elements
        cats.add("Zeenie");
        cats.add("Tiger");
        cats.add("Grayball");

        /**
         * old way for loop
         */

        for(int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }


        /**
         * foreach loop, use this way whenever possible.
         */
        for(String cat : cats)
            System.out.println(cat);
    }
}
