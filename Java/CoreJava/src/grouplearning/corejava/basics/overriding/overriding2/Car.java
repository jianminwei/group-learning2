package grouplearning.corejava.basics.overriding.overriding2;

public class Car implements Vehical{

    /**
     * By convention, when you implement an interface,
     * you also use "@Override" annotation. But if you
     * ignore this annotation, it still works.
     */
    @Override
    public String turn() {
        return "Car turned";
    }
}
