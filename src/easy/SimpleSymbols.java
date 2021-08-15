package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function SimpleSymbols(str) take the str parameter being passed
 * and determine if it is an acceptable sequence by
 * either returning the string true or false.
 * The str parameter will be composed of + and = symbols
 * with several characters between them (i.e. ++d+===+c++==a)
 * and for the string to be true each letter must be surrounded
 * by a + symbol. So the string to the left would be false.
 * The string will not be empty and will have at least one letter.
 */
public class SimpleSymbols {

  /**
   * Simple Symbols function.
   *
   * @param str input string
   * @return "true" if a sequence is acceptable
   */
  private static String simpleSymbols(String str) {
    Pattern pattern1 = Pattern.compile("(?=(\\+\\w\\+))");
    Pattern pattern2 = Pattern.compile("[a-z]");
    Matcher matcher1 = pattern1.matcher(str);
    Matcher matcher2 = pattern2.matcher(str);
    int count1 = 0;
    int count2 = 0;
    int i1 = 0;
    int i2 = 0;
    while (matcher1.find(i1)) {
      count1++;
      i1 = matcher1.start() + 1;
    }
    while (matcher2.find(i2)) {
      count2++;
      i2 = matcher2.start() + 1;
    }
    return count1 == count2 ? "true" : "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = simpleSymbols("=+e++r+f+v+");
    System.out.println(result1);
    var result2 = simpleSymbols("=+e++r+ff+v+");
    System.out.println(result2);
  }

}
