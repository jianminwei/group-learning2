package grouplearning.corejava.basics.overriding.overriding1;

public class Cat extends Animal{

    /**
     * This is standard Override in Java. A subclass define the same method to Override ancestor's
     * same method. Or you can think of when Cat's move() method is called, it will run this method,
     * not the Animal move() method.
     */
    @Override
    public String move() {
        return "Cat moved";
    }
}
