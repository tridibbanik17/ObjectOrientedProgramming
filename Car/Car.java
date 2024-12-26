/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The Car is an abstarct class that represents common characteristics
 * and behaviors of all cars.
 */

public abstract class Car {
    // Attributes of Car class
    private String make;
    private String model;

    //Constructor method
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter method that returns the make of the car
    public String getMake() {
        return make;
    }

    // Getter method that returns the model of the car
    public String getModel() {
        return model;
    }

    // Abstract methods for fuel efficiency and range calculations
    public abstract double calculateFuelEfficiency();
    public abstract double calculateRange();

}
