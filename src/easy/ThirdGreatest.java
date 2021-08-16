package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Have the function ThirdGreatest(strArr) take the array of strings stored in strArr
 * and return the third-largest word within it.
 * ---
 * So for example: if strArr is ["hello", "world", "before", "all"] your output
 * should be world because "before" is 6 letters long, and "hello" and "world" are both 5,
 * but the output should be world because it appeared as the last 5-letter word in the array.
 * ---
 * If strArr was ["hello", "world", "after", "all"] the output should
 * be after because the first three words are all 5 letters long, so return the last one.
 * The array will have at least three strings and each string will only contain letters.
 */
public class ThirdGreatest {

  /**
   * Third-Greatest function.
   *
   * @param strArr input array of strings
   * @return the third-longest word
   */
  private static String thirdGreatest(String[] strArr) {
    Arrays.sort(strArr, Collections.reverseOrder());
    Arrays.sort(strArr, Comparator.comparingInt(String::length));
    return strArr[strArr.length - 3];
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = thirdGreatest(new String[]{"flowers", "decorate", "soul", "sleep"});
    System.out.println(result1);
    var result2 = thirdGreatest(new String[]{"surrounded", "darkness", "awakened", "within"});
    System.out.println(result2);
  }

}
