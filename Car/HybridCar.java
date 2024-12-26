/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The HybridCar class extends Car class. 
 * It enhances the Car hierarchy by using a new type of car that combines features from both gasoline and electric cars.
 */

public class HybridCar extends Car {
    // Attributes
    private double fuelTankCapacity; // Property of gasoline cars
    private double milesPerGallon; // Property of gasoline cars
    private double batteryCapacity; // Property of electric cars
    private double milesPerKWh; // Property of electric cars


    // Constructor method with battery capacity
    public HybridCar(String make, String model, double fuelTankCapacity, double milesPerGallon, double batteryCapacity, double milesPerKWh) {
        super(make, model);
        this.fuelTankCapacity = fuelTankCapacity;
        this.milesPerGallon = milesPerGallon;
        this.batteryCapacity = batteryCapacity;
        this.milesPerKWh = milesPerKWh;
    }

    // Overloading of HybridCar() method
    // Constructor method without battery capacity
    public HybridCar(String make, String model, double fuelTankCapacity, double milesPerGallon) {
        this(make, model, fuelTankCapacity, milesPerGallon, 0, 0);
    }

    // Override
    // Since Hybrid car is a combination of gasoline and electric car, the average fuel efficiency is the overall fuel efficiency
    public double calculateFuelEfficiency() {
        return (milesPerGallon + milesPerKWh) / 2; // Average efficiency
    }

    // Override
    // Since Hybrid car is a combination of gasoline and electric car, the average range is the overall range
    public double calculateRange() {
        return (fuelTankCapacity * milesPerGallon) + (batteryCapacity * milesPerKWh);
    }
}
