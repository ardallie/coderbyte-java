package medium;

/**
 * Have the function Division(num1,num2) take both parameters being passed
 * and return the Greatest Common Factor.
 * That is, return the greatest number that evenly goes into both numbers
 * with no remainder.
 * ---
 * For example: 12 and 16 both are divisible by 1, 2, and 4 so the output should be 4.
 * The range for both parameters will be from 1 to 10^3.
 */
public class Division {

  /**
   * Division function.
   *
   * @param num1 input number 1
   * @param num2 input number 2
   * @return the GCF
   */
  private static int division(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
      return num1 + num2;
    }

    return division(num2, num1 % num2);
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    int result1 = division(20, 40);
    System.out.println(result1);
    int result2 = division(12, 16);
    System.out.println(result2);
  }

}
