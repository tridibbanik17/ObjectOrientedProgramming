import java.util.ArrayList;
/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The Main class is implements the main method. 
 * It demontrates the integration of the entire Car class hierarchy.
 */

public class Main {
    public static void main(String[] args) {
        // Create a fleet with all types of cars
        ArrayList<Car> carList = new ArrayList<>();
        // Add 4 Car objects to the ArrayList: one gasoline, one electric, one hybrid and one luxury car.
        carList.add(new GasolineCar("Hyundai", "Elantra", 17, 29));
        carList.add(new ElectricCar("Tesla", "Y", 57, 5.4));
        carList.add(new HybridCar("Honda", "Accord", 16, 49, 9.8, 7));
        carList.add(new LuxurySedan("Mercedes-Benz", "GLA", "Driver-assistance"));

        // Display details of each car
        for (Car car : carList) {
            System.out.println("For the car with make " + car.getMake() + ", and Model " + car.getModel() + ", ");
            System.out.println("Fuel Efficiency is " + car.calculateFuelEfficiency());
            System.out.println("Range is " + car.calculateRange());
            System.out.println();
        }
    }
}
