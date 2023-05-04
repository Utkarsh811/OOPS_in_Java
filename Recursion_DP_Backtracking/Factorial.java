package Recursion_DP_Backtracking;

import java.util.*;

//FACTORIAL
/*
 * n!=n*n-1!
 * 5!=5*4*3*2*1
 * 1!=1
 * 0!=1
 *
 * expectation is n knows how to calculate its factorial
 */
public class Factorial {

  public static long fact(long val) {
    if (val == 1) {
      return 1;
    }

    long ret = fact(val - 1);
    long res = ret * val;
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long val = sc.nextLong();
    System.out.println("the val is->" + fact(val));
  }
}
