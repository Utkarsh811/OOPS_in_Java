package Recursion_DP_Backtracking;

import java.util.*;

/*
 * 0    1   1   2   3   5   8
 * 0    1   2   3   4   5   6
 *
 * if(n=0 || n==1)return n
 *
 */

public class Fibonacci {

  //static ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1));

  public static int Fib(int n) {
    System.out.println("FIB-:" + n);
    if (n == 1 || n == 0) {
      return n;
    }
    int fib1 = Fib(n - 1);

    int fib2 = Fib(n - 2);
    int fib3 = fib1 + fib2;

    return fib3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ne = Fib(n);
    System.out.println(ne);
    //ystem.out.println(arr);
  }
}
