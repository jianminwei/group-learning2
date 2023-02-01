package grouplearning.corejava.basics.generics;

import grouplearning.corejava.basics.classes.Cat;

public class GenericDemoTest {
    public static void main(String[] args) {
        GenericDemo<String > g1 = new GenericDemo<>();
        g1.set("Hello");
        System.out.println(g1.get());

        GenericDemo<Integer> g2 = new GenericDemo<>();
        g2.set(10);
        System.out.println(g2.get());

        GenericDemo<Cat> g3 = new GenericDemo<>();
        Cat c = new Cat();
        c.setName("Zeenie");

        g3.set(c);
        System.out.println(g3.get().getName());
    }
}
