package easy;

/**
 * Have the function MultiplicativePersistence(num) take the num parameter being passed
 * which will always be a positive integer
 * and return its multiplicative persistence which is
 * the number of times you must multiply the digits in num until you reach a single digit.
 * ---
 * For example: if num is 39 then your program
 * should return 3 because 3 * 9 = 27 then 2 * 7 = 14
 * and finally 1 * 4 = 4 then you stop at 4.
 */
public class MultiplicativePersistence {

  /**
   * Multiplicative Persistence function.
   *
   * @param num input number
   * @return the number of times you must multiply
   */
  private static int multiplicativePersistence(int num) {
    int times = 0;
    int multiplied = num;
    while (multiplied > 9) {
      int product = 1;
      String[] intArr = Integer.toString(multiplied).split("");
      for (String i : intArr) {
        product *= Integer.parseInt(i);
      }
      multiplied = product;
      times++;
    }
    return times;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = multiplicativePersistence(2677889);
    System.out.println(result1);
    var result2 = multiplicativePersistence(8192);
    System.out.println(result2);
  }

}
