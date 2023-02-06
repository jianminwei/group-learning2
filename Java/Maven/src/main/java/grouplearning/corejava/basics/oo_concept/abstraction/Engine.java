package grouplearning.corejava.basics.oo_concept.abstraction;

import java.util.Random;

/**
 * Different people have different interpretation of Abstraction.
 * To me, abstraction is to decompose a complex process into small simple
 * unit of works; and hide the complexity to the outside users.
 *
 * For this Engine example, all users need to know is to call startEngine()
 * method. The implementation of startEngine() method is hidden from the users.
 *
 */
public class Engine {
    public void startEngine() {
        System.out.println("Starting engine...\n");

        if (!checkBattery()) {
            System.out.println("battery problem, engine start failed.");
            return;
        }else if (!checkOilPressure()) {
            System.out.println("Oil Pressure problem, engine start failed.");
            return;
        }else if(!checkGasInjectionPressure()) {
            System.out.println("injection pressure problem, engine start failed.");
            return;
        }

        System.out.println("\nEngine started");
    }

    private boolean checkBattery() {
        Random r = new Random();
        System.out.println("Checking battery... ");

        return   r.nextInt(100) < 90 ? true : false;
    }

    private boolean checkOilPressure() {
        Random r = new Random();
        System.out.println("Checking Oil Pressure... ");
        return   r.nextInt(100) < 90 ? true : false;
    }

    private boolean checkGasInjectionPressure() {
        Random r = new Random();
        System.out.println("Checking injection pressure...");
        return   r.nextInt(100) < 90 ? true : false;
    }
}
