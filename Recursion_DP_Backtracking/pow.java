package Recursion_DP_Backtracking;

import java.util.*;

public class pow {

  static boolean flag = true;

  public static double pow(double x, int n) {
    double ser = 1;

    if (n == 1) {
      return x;
    }

    if (n < 0 && flag == true) {
      flag = false;
      n = n * -1;
      x = 1 / x;
    }
    ser = pow(x, n - 1);

    if (!flag) {
      ser = ser * x;

      return ser;
    }
    if (flag) {
      ser = ser * x;

      return ser;
    }
    return ser;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    int n = sc.nextInt();
    System.out.println(pow(x, n));
  }
}
