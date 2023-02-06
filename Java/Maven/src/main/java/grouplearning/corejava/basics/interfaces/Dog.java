package grouplearning.corejava.basics.interfaces;

public class Dog implements Animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String move() {
        return "running";
    }
}
