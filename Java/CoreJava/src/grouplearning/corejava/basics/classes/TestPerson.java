package grouplearning.corejava.basics.classes;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Matthew");
        p.setAge(24);
        //Matthew's age is 24

        Person p2 = new Person();
        p2.setName("Kyle");
        p2.setAge(20);


        //added a comment for testing git.
        //added a 2nd comment for testing git.
        //Matthew added this line 1/14/23
        System.out.println("Matthew's age is " + p.getAge());
        System.out.println("Kyle's age is " + p2.getAge());
    }
}

