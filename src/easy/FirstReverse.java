package easy;

/**
 * Have the function FirstReverse(str) take the str parameter
 * being passed and return the string in reversed order.
 * For example: if the input string is "Hello World and Coders"
 * then your program should return the string sredoC dna dlroW olleH.
 */
public class FirstReverse {

  /**
   * First Reverse function.
   *
   * @param str input string
   * @return reversed string
   */
  private static String firstReverse(String str) {
    return new StringBuilder(str).reverse().toString();
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = firstReverse("Hello World and Coders");
    System.out.println(result1);
    var result2 = firstReverse("Good Looking Blues");
    System.out.println(result2);
  }

}
