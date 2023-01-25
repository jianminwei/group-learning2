package grouplearning.corejava.basics.exceptions;

import grouplearning.corejava.basics.classes.Person;

import java.util.Random;

public class AgeExceptionTest {

    public static void main(String[] args) {
        Person[] group = new Person[10];
        Random random = new Random();

        for(int i=0; i < group.length; i++) {
            Person p = new Person();
            p.setAge(random.nextInt(190));

            group[i] = p;
        }

        for(Person p : group) {
            try {
                AgeCheck.ageCheck(p.getAge());
            }catch (AgeException ex) {
                System.out.println("Caught the ageCheck exception, this group is too old");
                System.out.println(ex.getMessage());
            }
        }
    }
}
