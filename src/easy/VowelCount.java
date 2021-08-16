package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function VowelCount(str) take the str string
 * parameter being passed and return the number of vowels
 * the string contains (i.e. "All cows eat grass and moo" would return 8).
 * Do not count y as a vowel for this challenge.
 */
public class VowelCount {

  /**
   * Vowel Count function.
   *
   * @param str input string
   * @return the number of vowels in a string
   */
  private static int vowelCount(String str) {
    Pattern pattern = Pattern.compile("[aeiou]");
    Matcher matcher = pattern.matcher(str);
    int i = 0;
    int count = 0;
    while (matcher.find(i)) {
      count++;
      i = matcher.start() + 1;
    }
    return count;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = vowelCount("I cannot sleep unless I am surrounded by books.");
    System.out.println(result1);
    var result2 = vowelCount("Life itself is a quotation.");
    System.out.println(result2);
  }

}
