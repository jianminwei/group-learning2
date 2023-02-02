package grouplearning.corejava.basics.collections;

import java.util.ArrayList;
import java.util.Random;

public class CatTest2 {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Cat> blackCats = new ArrayList<>();
        Random random = new Random();
        String color;
        for (int i = 1; i < 16; i++) {
            if(random.nextInt(100) < 50){
                color = "Black";
            }
            else{
                color = "White";
            }
            cats.add(new Cat(color, i));
        }
        cats.stream().filter(e -> e.getColor().equals("Black")).forEach(e -> blackCats.add(e));
        blackCats.stream().forEach(e -> System.out.println(e.toString()));
    }
}
