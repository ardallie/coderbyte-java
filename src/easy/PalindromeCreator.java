package easy;

/**
 * Have the function PalindromeCreator(str) take the str parameter being passed
 * and determine if it is possible to create a palindromic string
 * of minimum length 3 characters by removing 1 or 2 characters.
 * ---
 * For example: if str is "abjchba" then you can remove the characters jc to produce "abhba"
 * which is a palindrome. For this example your program should return the two characters
 * that were removed with no delimiter and in the order they appear in the string, so jc.
 * ---
 * If 1 or 2 characters cannot be removed to produce a palindrome,
 * then return the string not possible. If the input string is already a palindrome,
 * your program should return the string palindrome.
 * ---
 * The input will only contain lowercase alphabetic characters.
 * Your program should always attempt to create the longest palindromic substring
 * by removing 1 or 2 characters (see second sample test case as an example).
 * The 2 characters you remove do not have to be adjacent in the string.
 */
public class PalindromeCreator {

  /**
   * A support function checking if a given string is a palindrome.
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
   * Palindrome Creator function.
   *
   * @param str input string
   * @return characters to be removed or "palindrome" or "not possible"
   */
  private static String palindromeCreator(String str) {
    if (isPalindrome(str)) {
      return "palindrome";
    }

    for (int i = 0; i < str.length(); i++) {
      StringBuilder combo = new StringBuilder();
      for (int k = 0; k < str.length(); k++) {
        if (k != i) {
          combo.append(str.charAt(k));
        }
      }
      if (isPalindrome(combo.toString()) && combo.length() >= 3) {
        return String.valueOf(str.charAt(i));
      }
    }

    for (int i = 0; i < str.length(); i++) {
      for (int j = i; j < str.length(); j++) {
        StringBuilder combo = new StringBuilder();
        for (int k = 0; k < str.length(); k++) {
          if (k != i && k != j) {
            combo.append(str.charAt(k));
          }
        }
        if (isPalindrome(combo.toString()) && combo.length() >= 3) {
          return String.valueOf(str.charAt(i)) + str.charAt(j);
        }
      }
    }

    return "not possible";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result2 = palindromeCreator("racecar");
    System.out.println(result2);
    var result1 = palindromeCreator("vhhgghhgghhk");
    System.out.println(result1);
    var result3 = palindromeCreator("rats live on no evil stars");
    System.out.println(result3);
  }

}
