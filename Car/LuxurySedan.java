/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The LuxurySedan extends LuxuryCar class, which means LuxurySedan is a subclass of LuxuryCar class. 
 * It represents a specific luxury car type based on the abstract concept of LuxuryCar.
 */

public class LuxurySedan extends LuxuryCar {
    // Constructor method for LuxurySedan class.
    public LuxurySedan(String make, String model, String luxuryFeature) {
        super(make, model, luxuryFeature);
    }

    // Override
    public double calculateFuelEfficiency() {
        // Arbitrary value for demonstration
        return 35; 
    }

    // Override
    public double calculateRange() {
        // Arbitrary value for demonstration
        return 275; 
    }
}