package easy;

/**
 * Have the function PowersofTwo(num) take the num parameter being passed
 * which will be an integer and return the string true if it's a power of two.
 * If it's not return the string false.
 * For example if the input is 16 then your program should return the string true
 * but if the input is 22 then the output should be the string false.
 */
public class PowersOfTwo {

  /**
   * Powers of Two function.
   *
   * @param num input number
   * @return the string true if it's a power of two.
   */
  private static String powerOfTwo(int num) {
    int bitwise = num & num - 1;
    return num != 0 && bitwise == 0 ? "true" : "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = powerOfTwo(15);
    System.out.println(result1);
    var result2 = powerOfTwo(64);
    System.out.println(result2);
  }

}
