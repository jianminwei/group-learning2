package grouplearning.corejava.basics.oo_concept.polymorphism.case2;

/**
 * To me, this is another kind of polymorphism. Bird class
 * is a Bird class. It has its own properties and behaviors (methods). Yet it can also
 * have other shapes by implementing other interfaces.
 */
public class Bird implements Move, Sing{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("bird moves by flying...");
    }

    @Override
    public void sing() {
        System.out.println("bird sings by chiu chiu chiu...");
    }
}
