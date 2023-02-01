package grouplearning.corejava.basics.overloading;

public class OverloadDemoTest {
    public static void main(String[] args) {

        OverloadDemo overloadDemo = new OverloadDemo();
        System.out.println(overloadDemo.add(1,2));
        System.out.println(overloadDemo.add(1.1,2.2));
        System.out.println(overloadDemo.add("good", " day"));

        Apple apple1 = new Apple("red", 0.5);
        Apple apple2 = new Apple("green", 0.4);

        System.out.println(overloadDemo.add(apple1, apple2));

        System.out.println(overloadDemo.add(new Apple("yellow", 0.3), new Apple("orange", 0.4)));

    }
}
