package Recursion_DP_Backtracking.Dynamic_Programming;

//746. Min Cost Climbing Stairs

import java.util.*;

public class ClimbingStairsMinCost {

  public static int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] minCost = new int[n + 1];
    minCost[n] = 0;
    for (int i = n - 1; i >= 0; i--) {
      int val1 = Integer.MAX_VALUE;
      int val2 = Integer.MAX_VALUE;
      if (i + 1 <= n) {
        val1 = minCost[i + 1];
        if (i + 2 <= n) {
          val2 = minCost[i + 2];
        }
      }

      minCost[i] = cost[i] + Math.min(val1, val2);
    }
    System.out.println(Arrays.toString(minCost));
    return Math.min(minCost[0], minCost[1]);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] cost = new int[n];
    for (int i = 0; i < n; i++) {
      cost[i] = sc.nextInt();
    }
    System.out.println(minCostClimbingStairs(cost));
  }
}
