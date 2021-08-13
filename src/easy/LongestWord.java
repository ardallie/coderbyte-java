package easy;

/**
 * Have the function LongestWord(sen) take the sen
 * parameter being passed and return the largest word in the string.
 * If there are two or more words that are the same length,
 * return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 */
public class LongestWord {

  /**
   * Longest Word function.
   *
   * @param sen input string
   * @return the longest word in a sentence
   */
  private static String longestWord(String sen) {
    String longest = "";
    String cleanWords = sen.replaceAll("[^a-zA-Z0-9 ]", "");
    String[] splitWords = cleanWords.split(" ");
    for (String splitWord : splitWords) {
      if (splitWord.length() > longest.length()) {
        longest = splitWord;
      }
    }
    return longest;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var r1 = longestWord("Dwell on the beauty of life. "
        + "Watch the stars, and see yourself running with them.");
    System.out.println(r1);
    var r2 = longestWord("The happiness of your life depends upon the quality of your thoughts.");
    System.out.println(r2);
  }

}
