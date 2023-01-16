package grouplearning.corejava.basics.inheritance;

abstract class shape {
    private int sides;
    private String name;

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSides() {
        return sides;
    }

    public String getName() {
        return name;
    }
    public abstract int calcArea();
}
