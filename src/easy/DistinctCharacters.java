package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Have the function DistinctCharacters(str) take the str parameter being passed
 * and determine if it contains at least 10 distinct characters,
 * if so, then your program should return the string true,
 * otherwise it should return the string false.
 * ---
 * For example: if str is "abc123kkmmmm?" then your program should return the string false
 * because this string contains only 9 distinct characters:
 * a, b, c, 1, 2, 3, k, m. ? adds up to 9.
 */
public class DistinctCharacters {

  /**
   * Distinct Characters function.
   *
   * @param str input string
   * @return "true" if a string contains at least 10 distinct characters.
   */
  private static String distinctCharacters(String str) {
    Set<Character> table = new HashSet<>();
    for (int i = 0; i < str.length(); i++) {
      table.add(str.charAt(i));
    }
    return table.size() >= 10 ? "true" : "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = distinctCharacters("12334bbmma:=6");
    System.out.println(result1);
    var result2 = distinctCharacters("001122334455667788");
    System.out.println(result2);
  }

}
