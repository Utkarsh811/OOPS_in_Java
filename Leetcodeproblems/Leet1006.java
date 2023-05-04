package Leetcodeproblems;

import java.util.*;

public class Leet1006 {

  enum operat {
    mul,
    div,
    plus,
    minus,
  }

  static int res = -1;
  static operat op = operat.mul;

  public static int print(int n) {
    if (n < 1) {
      System.out.println("the res is" + res);
      return 1;
    }
    if (res == -1) {
      res = res * n * -1;
    } else {
      switch (op) {
        case mul:
          op = operat.div;
          res = res * n;
          System.out.println(res);
          break;
        case div:
          op = operat.plus;
          res = res / n;
          System.out.println(res);
          break;
        case plus:
          op = operat.minus;
          res = res + n;
          System.out.println(res);
          break;
        case minus:
          op = operat.mul;
          res = res - n;
          System.out.println(res);
          break;
      }
    }

    print(n - 1);
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();

    System.out.println("the value is" + print(val));
  }
}
