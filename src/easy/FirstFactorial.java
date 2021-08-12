package easy;

/**
 * Have the function FirstFactorial(num) take
 * the num parameter being passed and return the factorial of it.
 * For example: if num = 4, then your program
 * should return (4 * 3 * 2 * 1) = 24.
 * For the test cases, the range will be between 1 and 18
 * and the input will always be an integer.
 */
public class FirstFactorial {

  /**
   * First Factorial function.
   *
   * @param num input number
   * @return facorial of the given number
   */
  private static int firstFactorial(int num) {
    if (num == 0) {
      return 1;
    } else {
      return num * firstFactorial(num - 1);
    }
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = firstFactorial(4);
    System.out.println(result1);
    var result2 = firstFactorial(8);
    System.out.println(result2);
  }

}
