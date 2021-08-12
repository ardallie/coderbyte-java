package easy;

/**
 * Have the function LargestPair(num) take the num parameter being passed
 * and determine the largest double-digit number within the whole number.
 * ---
 * For example: if num is 4759472 then your program should return 94 because
 * that is the largest double-digit number.
 * The input will always contain at least two positive digits.
 */
public class LargestPair {

  /**
   * Largest pair function.
   *
   * @param num input number
   * @return the largest double-digit number within the whole number
   */
  private static int largestPair(int num) {
    int largest = Integer.MIN_VALUE;
    String numstr = Integer.toString(num);
    for (int i = 0; i < numstr.length() - 1; i++) {
      int i1 = Integer.parseInt(String.valueOf(numstr.charAt(i)));
      int i2 = Integer.parseInt(String.valueOf(numstr.charAt(i + 1)));
      int pair = i1 * 10 + i2;
      if (pair > largest) {
        largest = pair;
      }
    }
    return largest;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    int result1 = largestPair(567353664);
    System.out.println(result1);
    int result2 = largestPair(8163264);
    System.out.println(result2);
  }

}
