package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Have the function ThreeFiveMultiples(num) return the sum
 * of all the multiples of 3 and 5 that are below num.
 * For example: if num is 10, the multiples of 3 and 5
 * that are below 10 are 3, 5, 6, and 9,
 * and adding them up you get 23, so your program should return 23.
 * The integer being passed will be between 1 and 100.
 */
public class ThreeFiveMultiples {

  private static final Set<Integer> freq = new HashSet<>();

  /**
   * Count Multiples.
   *
   * @param num input number
   * @param mp  a factor (multiplier)
   */
  private static void countMultiples(int num, int mp) {
    for (int i = mp; i < num; i += mp) {
      if (i % mp == 0) {
        freq.add(i);
      }
    }
  }

  /**
   * Three Five Multiples function.
   *
   * @param num input number
   * @return a result
   */
  private static int threeFiveMultiples(int num) {
    int total = 0;
    countMultiples(num, 3);
    countMultiples(num, 5);
    for (int i : freq) {
      total += i;
    }
    return total;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = threeFiveMultiples(17);
    System.out.println(result1);
    var result2 = threeFiveMultiples(117);
    System.out.println(result2);
  }

}
