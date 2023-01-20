package grouplearning.corejava.basics.interfaces;

public class Cat implements Creature{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "meow";
    }

}
