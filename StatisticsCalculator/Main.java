/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * Implementation of StatisticsCalculator.java using main method. 
 * The Main class calls methods from StatisticsCalculator to calculate average and median. 
 */

public class Main {
    public static void main(String[] args) {
        try {
            int[] data = {10, 20, 30, 40, 50};
            StatisticsCalculator calculator = new StatisticsCalculator(data);

            System.out.println("Average: " + calculator.calculateAverage());
            System.out.println("Median: " + calculator.calculateMedian());

            int[] emptyData = {};
            calculator.updateArray(emptyData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
