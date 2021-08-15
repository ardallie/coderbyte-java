package easy;

/**
 * Have the function StringMerge(str) read the str parameter being passed
 * which will contain a large string of alphanumeric characters with
 * a single asterisk character splitting the string evenly into two separate strings.
 * Your goal is to return a new string by pairing up the characters
 * in the corresponding locations in both strings.
 * For example: if str is "abc1*kyoo" then your program should return the string akbyco1o
 * because a pairs with k, b pairs with y, etc.
 * The string will always split evenly with the asterisk in the center.
 */
public class StringMerge {

  /**
   * String Merge function.
   *
   * @param str input string
   * @return a new string with paired up characters
   */
  public static String stringMerge(String str) {
    StringBuilder output = new StringBuilder();
    String[] strArr = str.trim().split("\\*");
    String str1 = strArr[0];
    String str2 = strArr[1];
    for (int i = 0; i < str1.length(); i++) {
      output.append(str1.charAt(i)).append(str2.charAt(i));
    }
    return output.toString();
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    String result = stringMerge("123hg*aaabb");
    System.out.println(result);
  }

}
