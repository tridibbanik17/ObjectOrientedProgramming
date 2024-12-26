/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The GasolineCarRefuel is a child class of GasolineCar implementing the Refuelable interface. 
 * It represents the action of refueling a gasoline-powered car.
 */

public class GasolineCarRefuel extends GasolineCar implements Refillable {
    // Constructor method.
    public GasolineCarRefuel(String make, String model, double fuelTankCapacity, double milesPerGallon) {
        super(make, model, fuelTankCapacity, milesPerGallon);
    }

    // override
    public void addEnergy(double fuel) {
        System.out.println("Added " + fuel + " gallons of fuel to the gasoline car.");
    }
}
