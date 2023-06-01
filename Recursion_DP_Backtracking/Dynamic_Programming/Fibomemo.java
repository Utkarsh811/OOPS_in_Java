package Recursion_DP_Backtracking.Dynamic_Programming;

import java.util.*;

//DYNAMIC APPROACH
public class Fibomemo {

  public static int Fibomen(int n, int[] storingbox) {
    System.out.println("FIB-:" + n);
    //BASE CASE
    if (n == 0 || n == 1) {
      return n;
    }

    //store to avoid extra processing
    if (storingbox[n] != 0) {
      return storingbox[n];
    }
    int fib1 = Fibomen(n - 1, storingbox);
    int fib2 = Fibomen(n - 2, storingbox);
    int fib3 = fib1 + fib2;
    storingbox[n] = fib3;
    return fib3;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Fibomen(n, new int[n + 1]));
  }
}
