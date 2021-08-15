package easy;

/**
 * Have the function Superincreasing(arr) take the array of numbers stored in arr
 * and determine if the array forms a superincreasing sequence
 * where each element in the array is greater than the sum of all previous elements.
 * The array will only consist of positive integers.
 * For example: if arr is [1, 3, 6, 13, 54] then your program
 * should return the string "true" because it forms a superincreasing sequence.
 * If a superincreasing sequence isn't formed, then your program
 * should return the string "false"
 */
public class Superincreasing {

  /**
   * Superincreasing function.
   *
   * @param arr input array
   * @return "true" if is a superincreasing sequence
   */
  private static String superincreasing(int[] arr) {
    int sum = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > sum) {
        sum += arr[i];
      } else {
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
    var result1 = superincreasing(new int[]{1, 3, 6, 13, 54});
    System.out.println(result1);
    var result2 = superincreasing(new int[]{3, 3});
    System.out.println(result2);
  }

}
