package grouplearning.corejava.basics.oo_concept.polymorphism.case2;

/**
 * To me, this is another kind of polymorphism. Dog class
 * is a Dog class. It has its own properties and behaviors (methods). Yet it can also
 * have other shapes by implementing other interfaces.
 */
public class Dog implements Move, Sing{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("dog moves by running...");
    }

    @Override
    public void sing() {
        System.out.println("dog sings by wow wow wow...");
    }
}
