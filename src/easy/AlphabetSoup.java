package easy;

import java.util.Arrays;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed
 * and return the string with the letters in alphabetical order (i.e. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 */
public class AlphabetSoup {

  /**
   * Alphabet Soup function.
   *
   * @param str input string
   * @return the string with the letters in alphabetical order
   */
  private static String alphabetSoup(String str) {
    char[] letters = str.toCharArray();
    Arrays.sort(letters);
    return String.valueOf(letters);
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = alphabetSoup("leftfield");
    System.out.println(result1);
    var result2 = alphabetSoup("underworld");
    System.out.println(result2);
  }

}
