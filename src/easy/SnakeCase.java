package easy;

/**
 * Have the function SnakeCase(str) take the str parameter being passed
 * and return it in proper snake case format where each word is lowercased
 * and separated from adjacent words via an underscore.
 * The string will only contain letters and some combination
 * of delimiter punctuation characters separating each word.
 */
public class SnakeCase {

  /**
   * Snake Case function.
   *
   * @param str input string
   * @return a string in a snake case format
   */
  private static String snakeCase(String str) {
    return str
        .toLowerCase()
        .replaceAll("([^a-z])", " ")
        .replaceAll(" +", "_")
        .trim();
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = snakeCase("Revolt is the right of the people");
    System.out.println(result1);
    var result2 = snakeCase("Fortitude is the guard and support of the other virtues");
    System.out.println(result2);
  }

}
