package grouplearning.corejava.basics.oo_concept.polymorphism.case1;

public abstract class Shape {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void draw();
}
