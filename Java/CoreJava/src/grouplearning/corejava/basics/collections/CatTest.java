package grouplearning.corejava.basics.collections;

import java.util.ArrayList;
import java.util.Random;

public class CatTest {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Cat> blackCats = new ArrayList<>();
        Random random = new Random();
        String color;

        //1st for loop requires the use of i and a constant 15 because cats array has no elements in it currently
        for (int i = 1; i <= 15; i++) {
            if (random.nextInt(100) < 50){
                color = "Black";
            }
            else {
                color = "White";
            }
            cats.add(new Cat(color, i));

            //2nd for loop checks if a cat has black color.  If it does, then it puts it into the blackCats array.
        }
        for(Cat cat:cats){
            if (cat.getColor().equals("Black")){
                blackCats.add(cat);
            }
        }

        //3rd for loop goes through each element in blackCats array and prints out the cat color (black) and age (index number of array)
        for(Cat cat:blackCats) {
            System.out.println(cat.toString());
        }
    }
}