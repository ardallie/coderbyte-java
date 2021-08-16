package easy;

/**
 * Have the function LetterCapitalize(str) take the str parameter
 * being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 */
public class LetterCapitalize {

  /**
   * Letter Capitalize function.
   *
   * @param str input string
   * @return string with the letters capitalised
   */
  private static String letterCapitalize(String str) {
    String[] splitWords = str.split(" ");
    for (int i = 0; i < splitWords.length; i++) {
      String word = splitWords[i];
      splitWords[i] = word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    return String.join(" ", splitWords);
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = letterCapitalize("The soul becomes dyed with the color of its thoughts.");
    System.out.println(result1);
    var result2 = letterCapitalize("The universe is change; our life is what our thoughts make it.");
    System.out.println(result2);
  }

}
