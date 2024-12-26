/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The ElectricCar is a child class of Car. 
 * It extends the Car class to create a specific type of cars called electric cars.
 */

public class ElectricCar extends Car {
    // Attributes
    private double batteryCapacity;
    private double milesPerKWh;

    // Constructor method.
    public ElectricCar(String make, String model, double batteryCapacity, double milesPerKWh) {
        super(make, model);
        this.batteryCapacity = batteryCapacity;
        this.milesPerKWh = milesPerKWh;
    }

    // Override
    public double calculateFuelEfficiency() {
        return milesPerKWh;
    }
    
    // override
    // range = batteryCapacity * milesPerKWh
    public double calculateRange() {
        return batteryCapacity * milesPerKWh;
    }
}