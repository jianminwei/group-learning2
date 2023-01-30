package grouplearning.corejava.basics.generics;

import grouplearning.corejava.basics.classes.Cat;

public class GenericStackTest {
    public static void main(String[] args) {
        GenericStack<Integer> gs1 = new GenericStack<>(100);
        gs1.push(1); gs1.push(2); gs1.push(3);

        System.out.println(gs1.pop());
        System.out.println(gs1.pop());
        System.out.println(gs1.pop());

        GenericStack<Double> gs2 = new GenericStack<>(100) ;
        gs2.push(1.111); gs2.push(2.222); gs2.push(3.333);
        System.out.println(gs2.pop());
        System.out.println(gs2.pop());
        System.out.println(gs2.pop());

        GenericStack<Cat> gs3 = new GenericStack<>(10);
        Cat c1 = new Cat(); c1.setName("Zeenie");
        Cat c2 = new Cat(); c2.setName("Tiger");

        gs3.push(c1); gs3.push(c2);
        System.out.println(gs3.pop().getName());
        System.out.println(gs3.pop().getName());

    }
}
