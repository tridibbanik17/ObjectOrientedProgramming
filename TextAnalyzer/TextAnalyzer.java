import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;


/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The TextAnalyzer class extends its superclass StringAnalyzer.
 * It provides additional text analysis functionality.
 * For example, it calculates average word length, finds the most frequent letter, and prints words in alphabetical order.
 */
public class TextAnalyzer extends StringAnalyzer {

    /**
     * Constructs a TextAnalyzer with a preprocessed string.
     * The parameter input is the uncleaned string to be analyzed.
     * The parameter input is passed to the constructor of the superclass StringAnalyzer.
     * It throws IllegalArgumentException if the input is null or empty.
     */
    public TextAnalyzer(String input) {
        super(input);
    }

    /**
     * The calculateAverageWordLength() method calculates the average word length in the cleaned string.
     * It returns the average word length as a double.
     */
    public double calculateAverageWordLength() {
        String[] words = getCleanedString().split(" ");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        if (words.length > 0) {
            // Formatted to 1 decimal places just to make it look cleaner, easier to visualize and more comprehensive.
            return Double.parseDouble(String.format("%.1f", (double) totalLength / words.length));
        } else {
            return 0.0;
        }
    }

    /**
     * The findMostFrequentLetter() method finds the most frequently occurring letter in the cleaned string.
     * It returns the most frequent letter as a character.
     */
    public char findMostFrequentLetter() {
        Map<Character, Integer> letterFrequency = new HashMap<>();
        // Makes an array of all non-whitespace characters and iterate through each character of it.
        for (char ch : getCleanedString().replace(" ", "").toCharArray()) {
            // Updates the frequency of the characters in the map.
            letterFrequency.put(ch, letterFrequency.getOrDefault(ch, 0) + 1);
        }

        // '\0' represents a null character. This initializes mostFrequent.
        char mostFrequent = '\0';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequent = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Returns the most frequent character.
        return mostFrequent;
    }

    /**
     * The printWordsInAlphabeticalOrder() method prints all unique words in alphabetical order.
     */
    public void printWordsInAlphabeticalOrder() {
        String[] words = getCleanedString().split(" ");
        // Converts the String array words into a list and pass that to Treeset constructor.
        // TreeSet stores words in alphabetical order.
        // Set<String> uniqueWords declares a Set to hold String elements.
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList(words)); 
        System.out.println("Words in alphabetical order:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
