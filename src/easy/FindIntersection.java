package easy;

/**
 * Have the function FindIntersection(strArr) read the array of strings
 * stored in strArr which will contain 2 elements: the first element
 * will represent a list of comma-separated numbers sorted in ascending order,
 * the second element will represent a second list of comma-separated numbers (also sorted).
 * Your goal is to return a comma-separated string containing
 * the numbers that occur in elements of strArr in sorted order.
 * If there is no intersection, return the string false.
 */
public class FindIntersection {

  /**
   * Binary Search helper function.
   *
   * @param coll an array of integers
   * @param key  a value to find
   * @return index of the key
   */
  private static int binarySearch(Integer[] coll, Integer key) {
    int lo = 0;
    int hi = coll.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < coll[mid]) {
        hi = mid - 1;
      } else if (key > coll[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  /**
   * Convert a string to an array of integers.
   *
   * @param strArr comma-delimited string of numbers
   * @return array of integers
   */
  private static Integer[] toIntArray(String strArr) {
    String[] tmpArr = strArr.split(", ");
    Integer[] intArr = new Integer[tmpArr.length];
    for (int i = 0; i < tmpArr.length; i++) {
      intArr[i] = Integer.parseInt(tmpArr[i].trim());
    }
    return intArr;
  }

  /**
   * Find Intersection function.
   *
   * @param arr input array containing two strings of comma-delimited integers
   * @return the numbers that occur in elements of strArr in sorted order.
   */
  private static String findIntersection(String[] arr) {
    Integer[] arr1 = toIntArray(arr[0]);
    Integer[] arr2 = toIntArray(arr[1]);
    StringBuilder builder = new StringBuilder();
    for (int i : arr1.length > arr2.length ? arr2 : arr1) {
      int findIndex = binarySearch(arr1.length > arr2.length ? arr1 : arr2, i);
      if (findIndex > -1) {
        builder.append(i).append(",");
      }
    }
    String result = builder.toString();
    return result.length() == 0 ? "false" : builder.substring(0, result.length() - 1);
  }

  /**
   * Entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    var result1 = findIntersection(new String[]{"11, 12, 14, 16, 20", "11, 12, 13, 18, 21"});
    System.out.println(result1);
    var result2 = findIntersection(new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"});
    System.out.println(result2);
    var result3 = findIntersection(new String[]{"21, 22, 23, 25, 27, 28", "21, 24, 25, 29"});
    System.out.println(result3);
  }

}
