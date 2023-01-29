package grouplearning.corejava.basics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {

    /**
     * The purpose of this demo is to show how to use stream
     * and apply your filter criteria to get the things you want.
     */
    public static void main(String[] args) {
        List <Apple>apples = new ArrayList<>();

        apples.add(new Apple("Red", 0.3));
        apples.add(new Apple("Green", 0.6));
        apples.add(new Apple("Red", 0.5));
        apples.add(new Apple("Yellow", 0.5));
        apples.add(new Apple("Green", 0.3));
        apples.add(new Apple("Red", 0.6));

        List <Apple> bigRedApples = apples.stream().filter(a -> a.getColor().equals("Red")).filter(a -> a.getWeight() > 0.4).collect(Collectors.toList());

        for (Apple a : bigRedApples) {
            System.out.println(a.toString());
        }

    }
}
