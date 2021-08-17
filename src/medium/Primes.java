package medium;

/**
 * Have the function Primes(num) take the num parameter being passed
 * and return the string true if the parameter is a prime number,
 * otherwise return the string false. The range will be between 1 and 2^16.
 */
public class Primes {

  private static boolean isPrime(int num) {
    // prime numbers are greater than 1
    if (num <= 1) {
      return false;
    }
    // 2 is an only even prime number
    // http://mathworld.wolfram.com/EvenPrime.html
    if (num == 2) {
      return true;
    }
    // eliminate all even numbers to reduce time complexity
    // (cannot be a prime number if is divisible by 2)
    if (num % 2 == 0) {
      return false;
    }
    // no need to check the entire range from 0 to num
    // (square root of num) + 1 is the sufficient upper limit
    // which greatly reduces time complexity
    double upper = Math.sqrt(num) + 1;
    // since the even numbers are eliminated, we can check the odd numbers only
    for (int i = 3; i < upper; i += 2) {
      if (num % i == 0) {
        // not a prime number
        return false;
      }
    }
    // must be a prime number!
    return true;
  }

  /**
   * Primes function.
   *
   * @param num input number
   * @return "true" if is a prime number
   */
  private static String primes(int num) {
    return isPrime(num) ? "true" : "false";
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    String result1 = primes(195);
    System.out.println(result1);
    String result2 = primes(197);
    System.out.println(result2);
  }

}
