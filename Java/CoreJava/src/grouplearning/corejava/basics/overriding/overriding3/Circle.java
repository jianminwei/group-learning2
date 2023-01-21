package grouplearning.corejava.basics.overriding.overriding3;

public class Circle extends Shape{

    private int radius;

    /**
     * By convention, when you extends an abstract class,
     * you also use "@Override" annotation for the implemented method. But if you
     * ignore this annotation, it still works.
     */
    @Override
    public double area(int r) {
        return 3.14 * r * r;
    }
}
