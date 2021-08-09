package easy;

/**
 * Have the function AdditivePersistence(num) take the num parameter being passed
 * which will always be a positive integer
 * and return its additive persistence which is the number of times
 * you must add the digits in num until you reach a single digit.
 * ---
 * For example: if num is 2718 then your program
 * should return 2 because 2 + 7 + 1 + 8 = 18
 * and 1 + 8 = 9, and you stop at 9.
 */
public class AdditivePersistence {

  /**
   * Additive Persistence function.
   *
   * @param num input number
   * @return additive persistence which is the number of times
   */
  private static int additivePersistence(int num) {
    int times = 0;
    int added = num;
    while (added > 9) {
      int sum = 0;
      String[] intArr = Integer.toString(added).split("");
      for (String i : intArr) {
        sum += Integer.parseInt(i);
      }
      added = sum;
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
    var result1 = additivePersistence(199);
    System.out.println(result1);
    var result2 = additivePersistence(913);
    System.out.println(result2);
  }

}
