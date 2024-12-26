import java.util.ArrayList;

/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The CarFleet class uses Car class and its subclasses to manage a fleet of cars.
 * The class performs operations on these cars without needing to know their specific types at compile time.
 */

public class CarFleet {
    public static void main(String[] args) {
        // Create a new instance of Gasoline car.
        Car gasoline = new GasolineCar("Toyota", "Corolla", 20, 30);
        // Create a new instance of electric car.
        Car electric = new ElectricCar("Tesla", "Model X", 50, 10);
        // Create a fleet of cars by appending each car to an ArrayList.
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(gasoline);
        carList.add(electric);
        double totalRange = 0.0;
       // Iterating over the fleet and printing fuel efficiency and range
        for (Car car : carList) {
            System.out.println("For the car make " + car.getMake() + " and model " + car.getModel() + ": ");
            System.out.println("Fuel Efficiency is " + car.calculateFuelEfficiency());
            System.out.println("Range is " + car.calculateRange());
            // Calculate the total range
            totalRange += car.calculateRange();
        }
        System.out.println("The total range of all cars in the fleet is " + totalRange);
    }
}

