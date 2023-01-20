package grouplearning.corejava.basics.controlFlows;

public class ShipTest {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.setAge(2);
        ship.setName("Titanic");
        ship.setType("Cruise");

        System.out.println("The ship age is " + ship.getAge());
        System.out.println("The ship name is " + ship.getName());
        System.out.println("The ship type is " + ship.getType());
    }
}
