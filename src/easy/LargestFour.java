package easy;

/**
 * Have the function LargestFour(arr) take the array of integers stored in arr,
 * and find the four largest elements and return their sum.
 * --
 * For example: if arr is [4, 5, -2, 3, 1, 2, 6, 6]
 * then the four largest elements in this array are 6, 6, 4, and 5
 * and the total sum of these numbers is 21, so your program should return 21.
 * --
 * If there are less than four numbers in the array your program
 * should return the sum of all the numbers in the array.
 */
public class LargestFour {

  /**
   * QuickSelect implementation based on Sedgewick R., Wayne K., Algorithms 4th edn.
   *
   * @param a input array
   * @param k k-smallest element in the list
   */
  private static void select(int[] a, int k) {
    int lo = 0;
    int hi = a.length - 1;
    while (hi > lo) {
      int i = partition(a, lo, hi);
      if (i > k) {
        hi = i - 1;
      } else if (i >= k) {
        return;
      } else {
        lo = i + 1;
      }
    }
  }

  private static int partition(int[] a, int lo, int hi) {
    int i = lo;
    int j = hi + 1;
    int v = a[lo];
    while (true) {
      // find item on lo to swap
      while (less(a[++i], v)) {
        if (i == hi) {
          break;
        }
      }
      // find item on hi to swap
      while (less(v, a[--j])) {
        if (j == lo) {
          break;      // redundant since a[lo] acts as sentinel
        }
      }
      // check if pointers cross
      if (i >= j) {
        break;
      }
      exchange(a, i, j);
    }
    // put partitioning item v at a[j]
    exchange(a, lo, j);
    // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
    return j;
  }

  private static boolean less(Comparable<Integer> v, Comparable<Integer> w) {
    return v.compareTo((Integer) w) < 0;
  }

  // exchange a[i] and a[j]
  private static void exchange(int[] a, int i, int j) {
    int swap = a[i];
    a[i] = a[j];
    a[j] = swap;
  }

  private static int largestFour(int[] arr) {
    int sum = 0;
    if (arr.length <= 4) {
      for (int i : arr) {
        sum += i;
      }
      return sum;
    }
    int k = arr.length - 4;
    select(arr, k);
    for (int i = k; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    int[] arr1 = new int[]{5, 6, 10, 12, 1, 1, 1, 5};
    int result1 = largestFour(arr1);
    System.out.println(result1);

    int[] arr2 = new int[]{0, 0, 2, 3, 7, 1};
    int result2 = largestFour(arr2);
    System.out.println(result2);

    int[] arr3 = new int[]{5, 6, 10, 12, 1, 1, 1, 5};
    int result3 = largestFour(arr3);
    System.out.println(result3);
  }
}
