package TcsDigital;

//MATRIX DIAGONAL DIFFERENCE

import java.util.*;

public class code11 {

  public static boolean isPerfectSquare(int n) {
    double sqr = Math.sqrt(n);

    return sqr == Math.floor(sqr);
  }

  public static int findMinSquares(int n) {
    if (isPerfectSquare(n)) {
      return 1;
    }

    int result = n;

    for (int i = 1; i * i < n; i++) {
      result = Integer.min(result, 1 + findMinSquares(n - i * i));
    }

    return result;
  }

  public static void main(String[] args) {
    int n = 19;
    System.out.println("The minimum number of squares is " + findMinSquares(n));
  }
}
