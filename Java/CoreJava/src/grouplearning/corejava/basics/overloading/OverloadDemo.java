package grouplearning.corejava.basics.overloading;

public class OverloadDemo {
    public int add(int i1, int i2) {
        return i1 + i2;
    }

    public double add(double d1, double d2) {
        return d1 + d2;
    }

    public String add(String s1, String s2) {
        return s1 + s2;
    }

    public double add (Apple a1, Apple a2) {
        return a1.getWeight() + a2.getWeight();
    }
}
