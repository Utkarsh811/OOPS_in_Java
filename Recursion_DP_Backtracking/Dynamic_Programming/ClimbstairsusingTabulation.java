//70. Climbing Stairs now using tabulation
package Recursion_DP_Backtracking.Dynamic_Programming;

import java.util.*;

public class ClimbstairsusingTabulation {

  public static int climbStairs(int n) {
    //using dp tabulation
    int[] dp = new int[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        dp[i] = dp[i - 1];
      } else {
        dp[i] = dp[i - 1] + dp[i - 2];
      }
    }

    return dp[n];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(climbStairs(n));
  }
}
