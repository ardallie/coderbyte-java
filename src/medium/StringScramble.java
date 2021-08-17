package medium;

import java.util.HashMap;

/**
 * Have the function StringScramble(str1,str2) take both parameters
 * being passed and return the string true. if a portion of str1 characters
 * can be rearranged to match str2, otherwise return the string false.
 * For example: if str1 is "rkqodlw" and str2 is "world"
 * the output should return true.
 * Punctuation and symbols will not be entered with the parameters.
 */
public class StringScramble {

  /**
   * String Scramble function.
   *
   * @param str1 input string 1
   * @param str2 input string 2
   * @return "true" if rearranged string matches input string 2
   */
  private static String stringScramble(String str1, String str2) {
    HashMap<String, Integer> freq = new HashMap<>();
    String[] arr1 = str1.replaceAll("([^" + str2 + "])", "").split("");
    String[] arr2 = str2.split("");
    for (String letter : arr1) {
      if (freq.containsKey(letter)) {
        freq.put(letter, freq.get(letter) + 1);
      } else {
        freq.put(letter, 1);
      }
    }
    for (String letter : arr2) {
      if (freq.containsKey(letter) && freq.get(letter) > 0) {
        freq.put(letter, freq.get(letter) - 1);
      } else {
        return "false";
      }
    }
    return "true";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    String result1 = stringScramble("win33er", "winner");
    System.out.println(result1);
    String result2 = stringScramble("rkqodlw", "world");
    System.out.println(result2);
  }

}
