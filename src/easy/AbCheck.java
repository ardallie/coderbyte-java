package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function ABCheck(str) take the str parameter being passed
 * and return the string true if the characters a and b are separated by exactly 3 places
 * anywhere in the string at least once (i.e. "lane borrowed" would result in true
 * because there is exactly three characters between a and b). Otherwise, return the string false.
 */
public class AbCheck {

  /**
   * AB Check function.
   *
   * @param str input string
   * @return the string true if the characters a and b are separated by exactly 3 places
   */
  private static String abCheck(String str) {
    Pattern pattern = Pattern.compile("(a...b|b...a)");
    Matcher matcher = pattern.matcher(str);
    return matcher.find() ? "true" : "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = abCheck("lane borrowed");
    System.out.println(result1);
    var result2 = abCheck("australia");
    System.out.println(result2);
  }

}
