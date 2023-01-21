package grouplearning.corejava.basics.class_constructor;

/**
 * By default, Java will create a no argument constructor for you.
 * However, if you define any constructors, Java is not going to create the default no argument constructor anymore.
 * You would have to create your own no argument constructor if you still need that no argument constructor
 * in addition to other constructors.
 */
public class Cat {

    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }
}
