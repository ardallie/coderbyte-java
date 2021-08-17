package medium;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function HTMLElements(str) read the str parameter being passed
 * which will be a string of HTML DOM elements and plain text.
 * ---
 * The elements that will be used are: b, i, em, div, p.
 * For example: if str is "<div><b><p>hello world</p></b></div>" then this string of DOM elements
 * is nested correctly so your program should return the string true.
 * ---
 * If a string is not nested correctly, return the first element encountered where,
 * if changed into a different element, would result in a properly formatted string.
 * ---
 * If the string is not formatted properly,
 * then it will only be one element that needs to be changed.
 * For example: if str is "<div><i>hello</i>world</b>"
 * then your program should return the string div
 * because if the first <div> element were changed into a <b>,
 * the string would be properly formatted.
 */
public class HtmlElements {

  /**
   * A stack helps to determine if elements are nested correctly.
   */
  private static final Stack<String> stack = new Stack<>();

  /**
   * Process a string to prepare for further inspection.
   * 1. convert to lowercase
   * 2. remove text content between tags
   * 3. add spaces between tags
   * 4. remove multiple spaces
   * 5. trim (remove leading and trailing spaces)
   * 6. split to array of strings
   *
   * @param str input string
   * @return parsed string
   */
  private static String[] parseElements(String str) {
    return str
        .toLowerCase()
        .replaceAll(">[^<]+", ">")
        .replaceAll("([>])(?=[<])", "$1 ")
        .replaceAll(" +", " ")
        .trim().split(" ");
  }

  /**
   * Checks if a string is an opening tag.
   *
   * @param tag a string to check
   * @return true if a string is an opening tag
   */
  private static boolean isOpeningTag(String tag) {
    Pattern pattern = Pattern.compile("<[a-z]>|<[a-z][a-z1-9]+>");
    Matcher matcher = pattern.matcher(tag);
    return matcher.find();
  }

  /**
   * Checks if a string is an closing tag.
   *
   * @param tag a string to check
   * @return true if a string is a closing tag
   */
  private static boolean isClosingTag(String tag) {
    Pattern pattern = Pattern.compile("</[a-z]>|</[a-z][a-z1-9]+>");
    Matcher matcher = pattern.matcher(tag);
    return matcher.find();
  }

  /**
   * Get an enclosed value.
   *
   * @param tag input tag with angle brackets
   * @return the enclosed value of a tag
   */
  private static String getTagValue(String tag) {
    return tag.replaceAll("[></]", "");
  }

  /**
   * HTML Elements function.
   *
   * @param str input string
   * @return "true" if elements are nested correctly, or an enclosed tag value if not.
   */
  private static String htmlElements(String str) {
    String[] parsedTags = parseElements(str);
    for (String tag : parsedTags) {
      if (isOpeningTag(tag)) {
        stack.push(tag);
      } else if (isClosingTag(tag) && !stack.isEmpty()) {
        if (getTagValue(stack.peek()).equals(getTagValue(tag))) {
          stack.pop();
        }
      }
    }
    return stack.isEmpty() ? "true" : getTagValue(stack.peek());
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    String result1 = htmlElements("<div><b><p>hello world</p></b></div>");
    System.out.println(result1);
    String result2 = htmlElements("<div><b><p>hello world</b></div>");
    System.out.println(result2);
  }

}
