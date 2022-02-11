package easy;

import static java.lang.Math.pow;

import java.util.Arrays;

/**
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr
 * and return the string true if any combination of numbers in the array
 * (excluding the largest number) can be added up to equal the largest number in the array,
 * otherwise return the string false.
 * ---
 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output
 * should return true because 4 + 6 + 10 + 3 = 23.
 * ---
 * The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 */


  /**
   * Array Addition I function.
   *
   * @param arr input array of integers
   * @return "true" if any combination can be added up to equal the largest number in the array
   */
  private static String arrayAdditionOne(int[] arr) {
    Arrays.sort(arr);
    int largest = arr[arr.length - 1];
    int sum=0;
    for(int i=0;i<arr.length-1;i++){
      sum+=arr[i];
      if(sum==largest)
        return "true";
    }
    return "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = arrayAdditionOne(new int[]{4, 6, 23, 10, 1, 3});
    System.out.println(result1);
    var result2 = arrayAdditionOne(new int[]{2, 6, 18});
    System.out.println(result2);
  }

}
