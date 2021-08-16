package easy;

/**
 * Have the function TwoSum(arr) take the array of integers stored in arr,
 * and determine if any two numbers (excluding the first element)
 * in the array can sum up to the first element in the array.
 * ---
 * For example: if arr is [7, 3, 5, 2, -4, 8, 11],
 * then there are actually two pairs that sum to the number 7: [5, 2] and [-4, 11].
 * ---
 * Your program should return all pairs,
 * with the numbers separated by a comma,
 * in the order the first number appears in the array.
 * Pairs should be separated by a space.
 * So for the example above, your program would return: 5,2 -4,11
 */
public class TwoSum {

  /**
   * Two Sum function.
   *
   * @param arr input array
   * @return all pairs
   */
  private static String twoSum(int[] arr) {
    StringBuilder output = new StringBuilder();
    for (int i = 1; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == arr[0]) {
          if (output.length() > 0) {
            output.append(" ");
          }
          output.append(arr[i]).append(",").append(arr[j]);
        }
      }
    }
    return output.length() == 0 ? "-1" : output.toString();
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result = twoSum(new int[]{8, 1, 2, 3, 4, 5, 7});
    System.out.println(result);
  }

}
