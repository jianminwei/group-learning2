package grouplearning.corejava.basics.property_vs_variable;

public class JumboTruck extends Truck{

    public void getTruckInfo(){
        model = "ford";
        // weightCapacity = 500; //error because it is private variable in Truck.java
        mileage = 10000;
    }

}
