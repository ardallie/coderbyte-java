package easy;

/**
 * Have the function GCF(arr) take the array of numbers stored in arr
 * which will always contain only two positive integers,
 * and return the greatest common factor of them.
 * ---
 * For example: if arr is [45, 12] then your program should return 3.
 * There will always be two elements in the array,
 * and they will be positive integers.
 */
public class Gcf {

  /**
   * Greatest Common Factor function.
   *
   * @param arr input array of integers
   * @return the greatest common factor
   */
  private static int gcf(int[] arr) {
    if (arr[0] == 0 || arr[1] == 0) {
      return arr[0] + arr[1];
    }
    return gcf(new int[]{arr[1], arr[0] % arr[1]});
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = gcf(new int[]{64, 128, 256, 512});
    System.out.println(result1);
    var result2 = gcf(new int[]{12, 28});
    System.out.println(result2);
  }

}
