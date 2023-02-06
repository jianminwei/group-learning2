package grouplearning.corejava.basics.oo_concept.polymorphism.case2;

import java.util.ArrayList;
import java.util.List;

/**
 * Dog and Bird can have both Move and Sing forms (polymorphism)
 */
public class MoveSingTest {
    public static void main(String[] args) {
        List <Move> list = new ArrayList<>();

        list.add(new Bird());
        list.add(new Dog());

        /**
         * dog and bird can move (have move form)
         */
        for (Move m : list) {
            m.move();
        }

        List <Sing> list2 = new ArrayList<>();

        list2.add(new Bird());
        list2.add(new Dog());

        /**
         * dog and bird can sing (have sing form)
         */
        for (Sing s : list2) {
            s.sing();
        }

    }
}
