package Recursion_DP_Backtracking.Dynamic_Programming;

import java.util.*;

public class ClimbingstairsvariablejumpsbyTabulation {

  //BY USING TABULATION METHOD
  public static int ClimbStairs(int n, int[] steps) {
    int[] dp = new int[n + 1];
    dp[n] = 1;

    for (int i = n - 1; i >= 0; i--) {
      int step = steps[i];
      int cnt = 1;
      if (steps[i] == 0) {
        dp[i] = 0;
        cnt++;
      } else {
        while (cnt <= step) {
          if (i + cnt <= n) {
            dp[i] = dp[i] + dp[i + cnt];
          }
          cnt++;
        }
      }
    }
    return dp[0];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] steps = new int[n];
    for (int i = 0; i < n; i++) {
      steps[i] = sc.nextInt();
    }
    System.out.println(ClimbStairs(n, steps));
  }
}
