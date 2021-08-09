package easy;

/**
 * Have the function BinaryReversal(str) take the str parameter being passed,
 * which will be a positive integer, take its binary representation
 * (padded to the nearest N * 8 bits), reverse that string of bits,
 * and then finally return the new reversed string in decimal form.
 * ---
 * For example: if str is "47" then the binary version of this integer is 101111,
 * but we pad it to be 00101111. Your program should reverse this binary string
 * which then becomes: 11110100 and then finally return
 * the decimal version of this string, which is 244.
 */
public class BinaryReversal {

  /**
   * Left pad the string with zeroes,
   * e.g. padLeft("fade", 8) -> "0000fade"
   *
   * @param str string to be padded
   * @param len new fixed length after applying the padding
   * @return padded string (e.g. 000000xxx)
   */
  private static String padLeft(String str, int len) {
    return String.format("%" + len + "s", str).replace(" ", "0");
  }

  /**
   * Binary Reversal function.
   *
   * @param str input string
   * @return the decimal version of this string
   */
  private static int binaryReversal(String str) {
    String binStr = Integer.toBinaryString(Integer.parseInt(str));
    int add = binStr.length() % 8 == 0 ? 0 : 1;
    int pad = add + binStr.length() / 8;
    String padStr = padLeft(binStr, pad * 8);
    StringBuilder result = new StringBuilder();
    for (int i = padStr.length() - 1; i >= 0; i--) {
      result.append(Character.getNumericValue(padStr.charAt(i)));
    }
    return Integer.parseInt(result.toString(), 2);
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = binaryReversal("47");
    System.out.println(result1);
    var result2 = binaryReversal("2");
    System.out.println(result2);
  }

}
