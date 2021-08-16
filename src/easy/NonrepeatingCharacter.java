package easy;

import java.util.HashMap;

/**
 * Have the function NonrepeatingCharacter(str)
 * take the str parameter being passed,
 * which will contain only alphabetic characters and spaces,
 * and return the first non-repeating character.
 * ---
 * For example: if str is "agettkgaeee" then your program should return k.
 * The string will always contain at least one character and there will
 * always be at least one non-repeating character.
 */
public class NonrepeatingCharacter {

  /**
   * Non-repeating Character function.
   *
   * @param str input string
   * @return the first non-repeating character
   */
  private static String nonrepeatingCharacter(String str) {

    char[] charArr = str.toLowerCase().toCharArray();
    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int c : charArr) {
      Integer count = freq.get(c);
      freq.put(c, count == null ? 1 : ++count);
    }

    for (int c : charArr) {
      Integer count = freq.get(c);
      if (count == 1) {
        return String.valueOf((char) c);
      }
    }
    return "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var res1 = nonrepeatingCharacter("Beauty in things exists in the mind which contemplates them");
    System.out.println(res1);
    var res2 = nonrepeatingCharacter("A wise man apportions his beliefs to the evidence");
    System.out.println(res2);
  }

}
