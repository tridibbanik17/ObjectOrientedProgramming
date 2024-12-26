/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The ElectricCarRecharge is a child class of ElectricCar implementing the Refuelable interface. 
 * It represents the action of recharging an electric car.
 */

public class ElectricCarRecharge extends ElectricCar implements Refillable {
    // Constructor method.
    public ElectricCarRecharge(String make, String model, double batteryCapacity, double milesPerKWh) {
        super(make, model, batteryCapacity, milesPerKWh);
    }

    // Override
    public void addEnergy(double charge) {
        System.out.println("Charged the electric car with " + charge + " kWh.");
    }
}
