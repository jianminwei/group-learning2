package grouplearning.corejava.basics.overriding.overriding3;

public abstract class Shape {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double area(int i);
}
