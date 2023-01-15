package grouplearning.corejava.basics.inheritance;

public class Animal {
    private double weight;
    private int age;

    public String makeSound() {
        return "This animal is making sound";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

}
