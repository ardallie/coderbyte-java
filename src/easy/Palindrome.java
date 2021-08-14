package easy;

/**
 * Have the function Palindrome(str) take the str parameter
 * being passed and return the string true
 * if the parameter is a palindrome,
 * (the string is the same forward as it is backward)
 * otherwise return the string false.
 * For example: "racecar" is also "racecar" backwards.
 * Punctuation and numbers will not be part of the string.
 */
public class Palindrome {

  /**
   * Palindrome function.
   *
   * @param str input string
   * @return "true" is the string is a palindrome
   */
  private static String palindrome(String str) {
    StringBuilder reversed = new StringBuilder();
    String cleaned = str.replaceAll(" ", "");
    reversed.append(cleaned).reverse();
    return cleaned.equals(reversed.toString()) && str.length() > 0 ? "true" : "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = palindrome("dont nod");
    System.out.println(result1);
    var result2 = palindrome("rats live on no evil star");
    System.out.println(result2);
  }

}
