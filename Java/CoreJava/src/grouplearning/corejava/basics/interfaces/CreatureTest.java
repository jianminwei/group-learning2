package grouplearning.corejava.basics.interfaces;

public class CreatureTest {
    public static void main(String[] args) {
        Creature arr[] = new Creature[3]; // creature array contains 3 elements/creatures

        Pig p = new Pig();
        p.setName("Pinky");

        Cat c = new Cat();
        c.setName("Zeeny");

        Horse h = new Horse();
        c.setName("Spirit");

        arr[0] = p;
        arr[1] = c;
        arr[2] = h;

        // this array loops through the different elements/creatures

        for( int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].makeSound());
        }

    }
}

