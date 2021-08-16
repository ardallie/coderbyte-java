package easy;

/**
 * Have the function SimpleEvens(num) check whether
 * every single number in passed in parameter is even.
 * If so, return the string true, otherwise return the string false.
 * For example: if num is 4602225 your program should
 * return the string false because 5 is not an even number.
 */
public class SimpleEvens {

  /**
   * Simple Evens function.
   *
   * @param num input number
   * @return "true" if a number is even
   */
  private static String simpleEvens(Integer num) {
    String[] digits = num.toString().split("");
    for (String digit : digits) {
      if (Integer.parseInt(digit) % 2 != 0) {
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
    String result1 = simpleEvens(222252);
    System.out.println(result1);
    String result2 = simpleEvens(228);
    System.out.println(result2);
  }

}
