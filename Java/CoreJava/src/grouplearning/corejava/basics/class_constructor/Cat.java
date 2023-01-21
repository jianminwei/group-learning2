package grouplearning.corejava.basics.class_constructor;

/**
 * By default, Java will create a no argument constructor for you.
 * However, if you define any constructors, Java is not going to create the default constructor anymore.
 * You would have to create on your own if you still need that no argument constructor.
 */
public class Cat {

    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }
}
