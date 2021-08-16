package easy;

/**
 * Have the function TimeConvert(num) take the num parameter being passed
 * and return the number of hours and minutes the parameter converts to
 * (i.e. if num = 63 then the output should be 1:3).
 * Separate the number of hours and minutes with a colon.
 */
public class TimeConvert {

  /**
   * Time Convert function.
   *
   * @param num input number
   * @return the number of hours and minutes
   */
  private static String timeConvert(int num) {
    int hours = num / 60;
    int minutes = num % 60;
    return hours + ":" + minutes;
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = timeConvert(63);
    System.out.println(result1);
    var result2 = timeConvert(178);
    System.out.println(result2);
    var result3 = timeConvert(249);
    System.out.println(result3);
  }

}
