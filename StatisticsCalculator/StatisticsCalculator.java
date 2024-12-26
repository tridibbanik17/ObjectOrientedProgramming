import java.util.Arrays;

/**
/*Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The StatisticsCalculator class performs statistical operations on an array of integers 
 * i.e., calculating average and median of the elements of the array.
 */

public class StatisticsCalculator {
    // Private data array to hold the integers for statistical calculations
    private int[] data;

    /**
     * This is the constructor method for StatisticsCalculator with a copy of the provided data array.
     * It accepts an array of integers named data for statistical calculations.
     * It throws an IllegalArgumentException if the array is null (it happens if the array is never initialized).
     */
    public StatisticsCalculator(int [] data) {
        if (data == null) {
            throw new IllegalArgumentException("Invalid input. Array cannot be null or empty.");
        }
        this.data = Arrays.copyOf(data, data.length);
    }

    /**
     * The calculateAverage() method calculates the average of the integers in the data array.
     * It returns the average value as a double, rounded to 2 decimal places.
     * It throws an ArithmeticException if the data array is empty.
     */    
    public double calculateAverage() {
        if (data.length == 0) {
            throw new ArithmeticException("Array is empty. Cannot perform operation.");
        }
    
        double sum = 0;
        for (int num : data) {
            sum = sum + num;
        }
        double average = sum / data.length;
        return Double.parseDouble(String.format("%.2f", average));
    }

    /**
     * The calculateMedian() method calculates the median of the integers in the data array.
     * It returns the median value as a double.
     * It throws the ArithmeticException if the data array is empty.
     */
    public double calculateMedian() {
        if (data.length == 0) {
            throw new ArithmeticException("Array is empty. Cannot perform operation.");
        }
        int[] sortedData = Arrays.copyOf(data, data.length);
        // To find the median, the array needs to be sorted first.
        Arrays.sort(sortedData);
        int middle = sortedData.length / 2;

        // Median calculation based on odd/even number of elements
        if (sortedData.length % 2 == 0) {
            return Double.parseDouble(String.format("%.2f", (sortedData[middle - 1] + sortedData[middle]) / 2));
        } else {
            return sortedData[middle];
        }
    }

    /**
     * The updateArray() method updates the data array with a new set of integers.
     * It accepts the new array of integers as a parameter.
     * It throws IllegalArgumentException if newData is null or empty.
     */
    public void updateArray(int[] newData) {
        if (newData == null || newData.length == 0) {
            throw new IllegalArgumentException("Invalid input. Array cannot be null or empty.");
        }
        this.data = Arrays.copyOf(newData, newData.length);    
    }

    /**
     * The accessArray() method provides a copy of the data array.
     * It ensures encapsulation by restricting direct access to the private array called data.
     * It returns a copy of the data array.
     */
    public int[] accessArray() {
        return Arrays.copyOf(data, data.length);
    }
}