/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The LuxuryCar is an abstract class that extends the Car class. 
 * It represents luxury cars with additional features that luxury card might have.
 */

public abstract class LuxuryCar extends Car {
    // Attribute
    private String luxuryFeature;

    // Constructor
    public LuxuryCar(String make, String model, String luxuryFeature) {
        super(make, model);
        this.luxuryFeature = luxuryFeature;
    }

    // Getter method to access luxury features.
    public String getLuxuryFeature() {
        return luxuryFeature;
    } 
}


