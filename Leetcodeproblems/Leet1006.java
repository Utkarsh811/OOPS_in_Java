package Leetcodeproblems;

import java.util.*;

public class Leet1006 {

  enum operators {
    mul,
    div,
    plus,
    minus,
  }

  static operators op = operators.mul;

  public static long print(long val) {
    if (val == 1) {
      return 1;
    }
    long ret = print(val - 1);
    long res = 0;

    switch (op) {
      case mul:
        res = ret * val;
        op = operators.div;
        break;
      case div:
        res = ret / val;
        op = operators.plus;
        break;
      case plus:
        res = ret + val;
        op = operators.minus;
        break;
      case minus:
        res = ret - val;
        op = operators.mul;
        break;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long val = sc.nextLong();
    System.out.println(print(val));
  }
}
