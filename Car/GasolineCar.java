/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The GasolineCar is a child class of Car. 
 * It extends the Car class to create a specific type of cars called gasoline-powered cars.
 */

public class GasolineCar extends Car {
    // Attributes
    private double fuelTankCapacity;
    private double milesPerGallon;

    // Constructor method
    public GasolineCar(String make, String model, double fuelTankCapacity, double milesPerGallon) {
        super(make, model);
        this.fuelTankCapacity = fuelTankCapacity;
        this.milesPerGallon = milesPerGallon;
    }

    // override
    public double calculateFuelEfficiency() {
        return milesPerGallon;
    }

    // override
    // range = fuelTankCapacity * milesPerGallon
    public double calculateRange() {
        return fuelTankCapacity * milesPerGallon;
    }
}
