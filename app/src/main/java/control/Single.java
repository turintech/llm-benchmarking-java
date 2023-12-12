package control;

import java.util.Vector;

public class Single {
  /**
   * This method is used to calculate the sum of the first n natural numbers.
   *
   * @param n The number of natural numbers to sum.
   * @return The sum of the first n natural numbers.
   */
  public static int SumRange(int n) {
    int[] arr = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = i;
    }
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }

  /**
   * This method calculates the maximum value in an array of integers.
   *
   * @param arr The array of integers.
   * @return The maximum value in the array.
   */
  public static int MaxArray(int[] arr) {
    int max = 0;
    for (int i : arr) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  /**
   * This method calculates the sum of the first n natural numbers, modulo m.
   *
   * @param n The number of natural numbers to sum.
   * @param m The modulus.
   */
  public static int SumModulus(int n, int m) {
    Vector<Integer> multiples = new Vector<Integer>();
    for (int i = 0; i < n; i++) {
      if (i % m == 0) {
        multiples.add(i);
      }
    }

    return multiples.stream().mapToInt(Integer::valueOf).sum();
  }
}
