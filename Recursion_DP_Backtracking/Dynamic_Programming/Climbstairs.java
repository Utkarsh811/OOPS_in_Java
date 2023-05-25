package Recursion_DP_Backtracking.Dynamic_Programming;

//70. Climbing Stairs

import java.util.*;

public class Climbstairs {

  public static int climbup(int n, int[] bucket) {
    //base case
    if (n == 0) {
      return 1;
    }
    if (n < 0) {
      return 0;
    }
    if (bucket[n] > 0) {
      return bucket[n];
    }

    //FAITH
    int np1 = climbup(n - 1, bucket);
    int np2 = climbup(n - 2, bucket);

    int totalways = np1 + np2;
    bucket[n] = totalways;
    return totalways;
  }

  public static int climbStair(int n) {
    //Using DP
    int res = climbup(n, new int[n + 1]);
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(climbStair(n));
  }
}
