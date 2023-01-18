package grouplearning.corejava.basics.interfaces;

public class AnimalTest {

    public static void main(String[] args) {
        Animal arr[] = new Animal[2];

        Fish f = new Fish();
        f.setName("Nemo");

        Dog d = new Dog();
        d.setName("Eza");

        arr[0] = f;
        arr[1] = d;

        /**
         * This is traditional way to loop through an array
         */
        for( int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].move());
        }

    }
}
