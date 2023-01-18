package grouplearning.corejava.basics.interfaces;

public class CreatureTest {
    public static void main(String[] args) {
        Cat shadow = new Cat();
        Chicken pea = new Chicken();
        Lion ray = new Lion();
        System.out.println("The Cat says "+shadow.makeSound());
        System.out.println("The Chicken says "+pea.makeSound());
        System.out.println("The Lion says "+ray.makeSound());
    }
}
