package hard;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function ReversePolishNotation(str) read str which will be an arithmetic expression
 * composed of only integers and the operators: +,-,* and /
 * and the input expression will be in postfix notation (Reverse Polish notation),
 * an example: (1 + 2) * 3 would be 1 2 + 3 * in postfix notation.
 * Your program should determine the answer for the given postfix expression.
 * For example: if str is 2 12 + 7 / then your program should output 2.
 */
class ReversePolishNotation {

  private static final Stack<String> stack = new Stack<>();

  /**
   * Cleaning, parsing and splitting the input string into the array of tokens.
   * 1. convert to lowercase
   * 2. remove multiple spaces
   * 3. split two bundled characters (but only when the second character is not a digit)
   * 4. split bundled command/operator and a digit. Excl. minus to keep negative numbers intact.
   * 5. trim (remove leading and trailing spaces)
   * 6. split to array of strings
   *
   * @param input input string
   * @return String array with parsed operators and operands
   */
  private static String[] parseConsoleInput(String input) {
    return input
        .toLowerCase()
        .replaceAll(" +", " ")
        .replaceAll("([\\p{P}\\p{S}a-z0-9])(?=[\\p{P}\\p{S}a-z])", "$1 ")
        .replaceAll("([^- 0-9])(?=[0-9])", "$1 ")
        .trim()
        .split(" ");
  }

  /**
   * Prints out a message to the console if the user input is invalid.
   *
   * @param op single element of the input string
   */
  private static void printInputError(String op) {
    System.out.println("Unrecognised operator or operand: \"" + op + "\".");
  }

  /**
   * Reduces two operands to a single result
   * by performing an arithmetical operation.
   *
   * @param a        operand A
   * @param b        operand B
   * @param operator denotes operation type (addition, substraction, division etc.)
   * @return result of the arithmetical operation
   * @throws ArithmeticException if divisor is 0
   */
  public static long reduceOperands(long a, long b, String operator) {
    switch (operator) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      case "/":
        if (b == 0) {
          System.out.println("Divide by 0.");
          throw new ArithmeticException();
        }
        return a / b;
      default:
        return 0;
    }
  }

  /**
   * Checks if the token is an operand (0-9).
   *
   * @param op a single token from the input string
   * @return true if the token is an operand, false if not
   */
  private static boolean isOperand(String op) {
    Pattern pattern = Pattern.compile("^[\\d]|^-[\\d]");
    Matcher matcher = pattern.matcher(op);
    return matcher.find();
  }

  /**
   * Checks if the token is an operator + - * / : ^ ( ) etc.
   *
   * @param op a single token from the input string
   * @return true if the token is an operator, false if not
   */
  private static boolean isOperator(String op) {
    Pattern pattern = Pattern.compile("^[+\\-*/^%]");
    Matcher matcher = pattern.matcher(op);
    return matcher.find();
  }

  /**
   * Takes two operands from stack and perform the operation with a provider operator.
   *
   * @param operator denotes operation type (addition, substraction, division etc.)
   * @return result of the evaluation
   */
  private static String performArithOperation(String operator) {
    if (stack.size() >= 2) {
      // Safe to evaluate
      String elementB = stack.pop();
      String elementA = stack.pop();
      long opB = Long.parseLong(elementB);
      long opA = Long.parseLong(elementA);
      long result = reduceOperands(opA, opB, operator);
      return Long.toString(result);
    } else {
      // Stack underflow since at least one element is null
      return null;
    }
  }

  /**
   * Computes the entire expression in Reverse Polish Notation.
   *
   * @param tokens expression tokens that are already parsed and split to Array of Strings
   */
  private static Long evaluateExpression(String[] tokens) {
    for (String token : tokens) {
      // token is an operand, push it to stack and move on
      if (isOperand(token)) {
        stack.push(token);
        continue;
      }
      // token is an operator, evaluate
      if (isOperator(token)) {
        String result = performArithOperation(token);
        if (result != null) {
          stack.push(result);
        }
        continue;
      }
      // token is illegal
      printInputError(token);
    }
    // all tokens have been processed
    if (stack.isEmpty()) {
      return null;
    }
    return Long.parseLong(stack.peek());
  }

  public static String reversePolishNotation(String expression) {
    String[] tokens = parseConsoleInput(expression);
    Long result = evaluateExpression(tokens);
    return result == null ? "" : result.toString();
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    String expression = "1 1 + 1 + 1 +";
    String result = reversePolishNotation(expression);
    System.out.println(result);
  }

}
