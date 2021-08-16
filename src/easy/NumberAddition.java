package easy;

/**
 * Have the function NumberSearch(str) take the str parameter,
 * search for all the numbers in the string, add them together,
 * then return that final number.
 * ---
 * For example: if str is "88Hello 3World!" the output should be 91.
 * You will have to differentiate between single digit numbers
 * and multiple digit numbers like in the example above.
 * So "55Hello" and "5Hello 5" should return two different answers.
 * Each string will contain at least one letter or symbol.
 */
public class NumberAddition {

  /**
   * Number Addition function.
   *
   * @param str input string
   * @return the final number
   */
  private static int numberAddition(String str) {
    String cleaned = str.replaceAll("[^0-9]", " ");
    String[] splitNum = cleaned.split(" +");
    int sum = 0;
    for (String c : splitNum) {
      if (!c.equals("")) {
        sum += Integer.parseInt(c);
      }
    }
    return sum;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = numberAddition("Chillhouse Mix 2 (2001)");
    System.out.println(result1);
    var result2 = numberAddition("Cafe del Mar 5 (1998)");
    System.out.println(result2);
  }

}
