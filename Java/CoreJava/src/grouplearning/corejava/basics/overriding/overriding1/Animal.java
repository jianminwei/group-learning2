package grouplearning.corejava.basics.overriding.overriding1;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String move() {
        return "Animal moved";
    }
}
