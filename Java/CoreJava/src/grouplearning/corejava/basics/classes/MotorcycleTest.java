package grouplearning.corejava.basics.classes;

public class MotorcycleTest {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setModel("Harley Davis");
        motorcycle.setMileage(15000);
        System.out.println("The model is " + motorcycle.getModel());
        System.out.println("Your mileage is " + motorcycle.getMileage());
    }
}
