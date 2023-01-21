package grouplearning.corejava.basics.overriding.overriding3;

public class Circle extends Shape{

    private int radius;

    @Override
    public double area(int r) {
        return 3.14 * r * r;
    }
}
