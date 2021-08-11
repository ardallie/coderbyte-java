package easy;

/**
 * Have the function DashInsert(str) insert dashes ('-')
 * between each two odd numbers in str. For example:
 * if str is 454793 the output should be 4547-9-3.
 * Don't count zero as an odd number.
 */
public class DashInsert {

  /**
   * Dash Insert function.
   *
   * @param str input string
   * @return a string with dashes between each two odd numbers
   */
  private static String dashInsert(String str) {
    StringBuilder dashed = new StringBuilder();
    char[] chars = str.toCharArray();
    for (int i = 1; i < chars.length + 1; i++) {
      int c1 = Character.getNumericValue(chars[i - 1]);
      int c2 = i < chars.length ? Character.getNumericValue(chars[i]) : 0;
      dashed.append(c1);
      if (c1 % 2 != 0 && c2 % 2 != 0) {
        dashed.append("-");
      }
    }
    return dashed.toString();
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = dashInsert("454793");
    System.out.println(result1);
    var result2 = dashInsert("25928");
    System.out.println(result2);
  }

}
