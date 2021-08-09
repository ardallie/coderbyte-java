package easy;

import java.util.HashMap;

/**
 * Have the function BasicRomanNumerals(str) read str which will be a string of Roman numerals.
 * The numerals being used are: I for 1, V for 5, X for 10, L for 50,
 * C for 100, D for 500 and M for 1000.
 * In Roman numerals, to create a number like 11 you simply add a 1 after the 10,
 * so you get XI. But to create a number like 19, you use the subtraction notation
 * which is to add I before an X or V (or add an X before an L or C).
 * So 19 in Roman numerals is XIX.
 * ---
 * The goal of your program is to return the decimal equivalent of the Roman numeral given.
 * For example: if str is "XXIV" your program should return 24
 */
public class BasicRomanNumerals {

  /**
   * Basic Roman Numerals function.
   *
   * @param str input string
   * @return the decimal equivalent of the Roman numeral given
   */
  private static int basicRomanNumerals(String str) {
    HashMap<String, Integer> numerals = new HashMap<>();
    numerals.put("M", 1000);
    numerals.put("D", 500);
    numerals.put("C", 100);
    numerals.put("X", 10);
    numerals.put("L", 50);
    numerals.put("V", 5);
    numerals.put("I", 1);
    // reversing the string makes the parsing easier
    char[] reversed = new StringBuilder(str).reverse().toString().toCharArray();
    int result = 0;
    int prevValue = 0;
    for (char cr : reversed) {
      int thisValue = numerals.get(Character.toString(cr));
      if (thisValue > prevValue) {
        result += thisValue;
      } else {
        result -= thisValue;
      }
      prevValue = thisValue;
    }
    return result;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = basicRomanNumerals("XXIV");
    System.out.println(result1);
    var result2 = basicRomanNumerals("XLVI");
    System.out.println(result2);
  }

}
