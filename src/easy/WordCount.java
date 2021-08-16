package easy;

/**
 * Have the function WordCount(str) take the str string
 * parameter being passed and return the number of words the string
 * contains (e.g. "Never eat shredded wheat or cake" would return 6).
 * Words will be separated by single spaces.
 */
public class WordCount {

  /**
   * Word Count function.
   *
   * @param str input string
   * @return the number of words the string
   */
  private static int wordCount(String str) {
    String[] words = str.split(" ");
    return str.length() > 0 ? words.length : 0;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = wordCount("The mind was dreaming. The world was its dream.");
    System.out.println(result1);
    var result2 = wordCount("I have always imagined that Paradise will be a kind of library.");
    System.out.println(result2);
  }

}
