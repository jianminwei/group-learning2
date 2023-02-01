package grouplearning.corejava.basics.abstract_class;

public class TestCat {

    public static void main(String[] args) {
        Cat c = new Cat();

        c.setName("Zeeny");
        c.setAge(2);

        System.out.println(c.getName());
        System.out.println(c.makeSound());
    }
}
