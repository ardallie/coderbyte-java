package hard;

import java.util.HashMap;

/**
 * Have the function RomanNumeralReduction(str) read str
 * which will be a string of roman numerals in decreasing order.
 * The numerals being used are: I for 1, V for 5, X for 10,
 * L for 50, C for 100, D for 500 and M for 1000.
 * Your program should return the same number given
 * by str using a smaller set of roman numerals.
 * For example: if str is "LLLXXXVVVV" this is 200, so your program should return CC
 * because this is the shortest way to write 200 using the roman numeral system given above.
 * If a string is given in its shortest form, just return that same string.
 */
public class RomanNumReduction {

  private static final HashMap<String, Integer> romans = new HashMap<>() {
    {
      put("M", 1000);
      put("D", 500);
      put("C", 100);
      put("L", 50);
      put("X", 10);
      put("V", 5);
      put("I", 1);
    }
  };

  private static final String[] orderedRomans = new String[]{"M", "D", "C", "L", "X", "V", "I"};

  /**
   * Calculate the sum for an expression.
   *
   * @param exp expression
   * @return a sum
   */
  public static int sumRomans(String exp) {
    int result = 0;
    String[] tokens = exp.toUpperCase().split("");
    for (String token : tokens) {
      result += romans.get(token);
    }
    return result;
  }

  /**
   * Reduce Roman numerals.
   *
   * @param sum a number
   * @return a string of Roman numerals
   */
  public static String reduceRomans(int sum) {
    StringBuilder output = new StringBuilder();
    int remainder = sum;
    for (String numeral : orderedRomans) {
      Integer val = romans.get(numeral);
      while (remainder / val >= 0 && remainder - val >= 0) {
        output.append(numeral);
        remainder -= val;
      }
    }
    return output.toString();
  }

  /**
   * Roman Numeral Reduction function.
   *
   * @param str input string
   * @return result
   */
  public static String romanNumeralReduction(String str) {
    int sum = sumRomans(str);
    return reduceRomans(sum);
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    String result1 = romanNumeralReduction("XXXVVIIIIIIIIII");
    System.out.println(result1);
    String result2 = romanNumeralReduction("VVV");
    System.out.println(result2);
    String result3 = romanNumeralReduction("CCCCCIIIII");
    System.out.println(result3);
  }

}
