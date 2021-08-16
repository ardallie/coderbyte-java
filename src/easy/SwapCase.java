package easy;

/**
 * Have the function SwapCase(str) take the str parameter
 * and swap the case of each character.
 * For example: if str is "Hello World" the output should be hELLO wORLD.
 * Let numbers and symbols stay the way they are.
 */
public class SwapCase {

  /**
   * Swap Case function.
   *
   * @param str input string
   * @return the output string
   */
  private static String swapCase(String str) {
    StringBuilder out = new StringBuilder();
    char[] chars = str.toCharArray();
    for (char c : chars) {
      if (Character.isLowerCase(c)) {
        out.append(Character.toUpperCase(c));
      } else {
        out.append(Character.toLowerCase(c));
      }
    }
    return out.toString();
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = swapCase("The Livin' Free EP");
    System.out.println(result1);
    var result2 = swapCase("Selected MP3");
    System.out.println(result2);
  }

}
