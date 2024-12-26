import java.util.Map;
import java.util.HashMap;

/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The StringAnalyzer class reuses the StringCleaner class to preprocess the string and performs several processing of strings.
 * For example,  in the cleaned string, it calculates the frequency of each word, finds the longest word, and checks for palindromes.
 */
public class StringAnalyzer {
    // final keyword makes sure that the reference to this variable cannot be changed after it is initialized.
    private final String cleanedString;

    /**
     * This is the constructor method that constructs a StringAnalyzer object reusing the StringCleaner class.
     * It accepts input parameter as a string, which is the uncleaned string to be analyzed.
     * It throws IllegalArgumentException if the input is null or empty.
     */
    public StringAnalyzer(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input. String cannot be null or empty.");
        }
        // Constructs a new instance of StringCleaner class.
        StringCleaner cleaner = new StringCleaner();
        // Reuse cleanString method. 
        this.cleanedString = cleaner.cleanString(input);
    }

    public String getCleanedString() {
        return cleanedString;
    }  

    /**
     * The getWordFrequencies() method calculates the frequency of each word in the cleaned string.
     * It returns a map where keys are words of type String and values of type Integer are the frequency of each word.
     */
    public Map<String, Integer> getWordFrequencies() {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = cleanedString.split(" ");
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        return frequencyMap;
    }

    /**
     * The getLongestWord() method finds the longest word in the cleaned string.
     * It returns the longest word in the cleaned string.
     * It throws ArithmeticException if the cleaned string is empty.
     */
    public String getLongestWord() {
        if (cleanedString.isEmpty()) {
            throw new ArithmeticException("Empty string. Cannot find the longest word.");
        }
        String[] words = cleanedString.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    /**
     * The isPalindrome() method checks if the cleaned string is a palindrome. It ignores spaces and letter case.
     * It returns true if the cleaned string is a palindrome, otherwise returns false.
     * It throws ArithmeticException if the cleaned string is empty.
     */
    public boolean isPalindrome() {
        if (cleanedString.isEmpty()) {
            throw new ArithmeticException("Empty string. Cannot check for palindrome.");
        }
        String processedString = cleanedString.replace(" ", "").toLowerCase();
        int left = 0;
        int right = processedString.length() - 1;
        while (left < right) {
            if (processedString.charAt(left) != processedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


