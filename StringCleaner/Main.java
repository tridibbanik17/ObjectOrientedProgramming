/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The Main class calls cleanString() method from StringCleaner class 
 * to trim leading and trailing spaces or any other extra space, convert characters to lowercase and remove punctuation.
 */
public class Main {
    public static void main(String[] args) {
        StringCleaner cleaner = new StringCleaner();
        String text = "  Hello, World! How's it going?  ";
        String cleanedText = cleaner.cleanString(text);
        System.out.println("Cleaned Text: " + cleanedText);
    }
}
