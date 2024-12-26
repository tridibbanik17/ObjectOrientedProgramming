/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * Main class is the implementation of StringAnalyzer by calculating the frequency of each word in the cleaned string, finds the longest word in the cleaned string and checks if the cleaned string is a palindrome.
 */
public class Main {
    public static void main(String[] args) {
        try {
            StringAnalyzer analyzer = new StringAnalyzer("A man a plan a canal Panama");

            System.out.println("Word Frequencies: " + analyzer.getWordFrequencies());
            System.out.println("Longest Word: " + analyzer.getLongestWord());
            System.out.println("Is Palindrome: " + analyzer.isPalindrome());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
