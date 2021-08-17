package medium;

/**
 * Have the function PalindromeTwo(str) take the str parameter being passed
 * and return the string true if the parameter is a palindrome,
 * (the string is the same forward as it is backward)
 * otherwise return the string false.
 * ---
 * The parameter entered may have punctuation and symbols,
 * but they should not affect whether the string is in fact a palindrome.
 * For example: "Anne, I vote more cars race Rome-to-Vienna" should return true.
 */
public class PalindromeTwo {

  /**
   * Check if a string is a palindrome.
   *
   * @param str input string
   * @return true if a string is a palindrome
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
   * Palindrome Two function.
   *
   * @param str input string
   * @return "true" if a string is a palindrome
   */
  public static String palindromeTwo(String str) {
    String parsed = str.toLowerCase().replaceAll("[^a-z$]", "");
    return isPalindrome(parsed) ? "true" : "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    String result1 = palindromeTwo("Noel - sees Leon");
    System.out.println(result1);
    String result2 = palindromeTwo("A man, a plan, a canal – Panama.");
    System.out.println(result2);
    String result3 = palindromeTwo("No lemon, no melon!");
    System.out.println(result3);
  }

}
