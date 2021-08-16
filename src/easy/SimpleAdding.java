package easy;

/**
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num.
 * For example: if the input is 4 then your program
 * should return 10 because 1 + 2 + 3 + 4 = 10.
 * For the test cases, the parameter num will be any number from 1 to 1000.
 */
public class SimpleAdding {

  /**
   * Simple Adding function.
   *
   * @param num input number
   * @return the sum of numbers
   */
  private static int simpleAdding(int num) {
    return num * (num + 1) / 2;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = simpleAdding(100);
    System.out.println(result1);
    var result2 = simpleAdding(8);
    System.out.println(result2);
  }

}
