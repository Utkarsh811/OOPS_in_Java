package Recursion_DP_Backtracking;

import java.util.*;

/*
 * method1(5) ->
 * 5
 * 4
 * 3
 * 2
 * 1
 * lets think method1(4) will give  4,3,2,1
 *
 * method1(n)->n,n-1,n-2,n-3 . . .1
 */

public class Recur1 {

  public static int print(int n) {
    if (n < 1) {
      return 0;
    }
    if (n == 1) {
      System.out.print(n + "->");
    } else {
      System.out.print(n + "->");
    }

    return print(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print(n);
  }
}
