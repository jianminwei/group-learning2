package grouplearning.corejava.basics.oo_concept.encapsulation;

public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person();

        p.setFirstName("Foo");
        p.setLastName("Bar");
        p.setAge(20);

        System.out.println(p.getFullName());
    }
}
