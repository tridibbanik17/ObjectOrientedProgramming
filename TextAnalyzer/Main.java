/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 */

public class Main {
    public static void main(String[] args) {
        String input = "New Letters! New Words! Need to be able to analyze all of them.";
        
        TextAnalyzer analyzer = new TextAnalyzer(input);
        
        // Print the frequency of each word in the input string.
        System.out.println("Word Frequency: " + analyzer.getWordFrequencies());
        // Print the longest word in the input string.
        System.out.println("Longest Word: " + analyzer.getLongestWord());
        // Check if the input string is a palindrome and print the result.
        System.out.println("Is Palindrome: " + analyzer.isPalindrome());
        // Calculate and print the average word length in the input string.
        System.out.println("Average Word Length: " + analyzer.calculateAverageWordLength());
        // Find and print the most frequent letter in the input string.
        System.out.println("Most Frequent Letter: " + analyzer.findMostFrequentLetter());
        // Print all words in the input string in alphabetical order.
        analyzer.printWordsInAlphabeticalOrder();
    }
}
