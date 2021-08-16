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
   * An improved function checking if a given string is a palindrome.
   * It compares two halves of a string, checking if a letter
   * from the first half matches the other half in the reverse order.
   *
   * @param str input string
   * @return true if the string is a palindrome
   */
  private static boolean isPalindrome(String str) {
    char[] strArr = str.toCharArray();
    int len = strArr.length;
    for (int i = 0; i < len / 2; i++) {
      if (strArr[i] != strArr[len - i - 1]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = palindrome("dont nod");
    System.out.println(result1);
    var result2 = isPalindrome("dont nod");
    System.out.println(result2);
    var result3 = palindrome("rats live on no evil star");
    System.out.println(result3);
    var result4 = isPalindrome("rats live on no evil star");
    System.out.println(result4);
  }

}
