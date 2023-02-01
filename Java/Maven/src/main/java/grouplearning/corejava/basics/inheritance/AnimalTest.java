package grouplearning.corejava.basics.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setAge(2);
        cat.setWeight(5);

        dog.setAge(5);
        dog.setWeight(20.5);

        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
        System.out.println(cat.makeSound());

        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        System.out.println(dog.makeSound());
    }
}
