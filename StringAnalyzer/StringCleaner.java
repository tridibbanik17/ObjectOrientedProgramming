package assignment04q4_package;

/**
/* Author: Tridib Banik, McMaster University, Software Engineering Level II.
 * The StringCleaner class performs basic string preprocessing tasks.
 * For example, it removes punctuation, converts all letters to lowercase, and removes unnecessary spaces.
 */

public class StringCleaner {

    /**
     * The removePunctuation() method removes all punctuation characters from the text string.
     * It accepts text as a string.
     * It returns a string without punctuation characters by replacing all punctuations by an empty string.
     */
    public static String removePunctuation(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("[\\p{Punct}]", "");
    }

    /**
     * The convertToLowercase() method converts all characters in the text string to lowercase.
     * It accepts text as a string.
     * It returns a string with all of its letters being lowercase.
     */
    public static String convertToLowercase(String text) {
        if (text == null) {
            return null;
        }
        return text.toLowerCase();
    }

    /**
     * The removeExtraSpaces() method removes leading, trailing, and extra spaces (i.e., more than one space) between words in the text string.
     * It accepts text as a string.
     * It returns a string with single spaces between words, and no leading or trailing spaces.
     */
    public static String removeExtraSpaces(String text) {
        if (text == null) {
            return null;
        }

        // All the leading and trailing spaces are removed by using trim().
        // All the spaces between words that are more than one, are replaced by single spaces.
        return text.trim().replaceAll("\\s+", " ");
    }

    /**
     * The cleanString() method performs all preprocessing tasks on the text string.
     * For example, it removes punctuation, converts to lowercase, and removes extra spaces.
     * It accepts text as a string.
     * It returns a fully processed string.
     */
    public static String cleanString(String text) {
        if (text == null) {
            return null;
        }
        String result = removePunctuation(text);
        result = convertToLowercase(result);
        result = removeExtraSpaces(result);
        return result;
    }
}
