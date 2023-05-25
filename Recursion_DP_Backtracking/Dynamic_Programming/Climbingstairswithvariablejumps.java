package Recursion_DP_Backtracking.Dynamic_Programming;

//CLIMB STAIRS WITH VARIABLE JUMP
import java.util.*;

public class Climbingstairswithvariablejumps {

  public static int climbStairs(int source, int[] arr, int dest, int[] memo) {
    if (source == dest) {
      return 1;
    }
    if (source > dest) {
      return 0;
    }
    if (memo[source] > 0) {
      return memo[source];
    }
    int totalways = 0;
    int ways = 0;

    //FAITH
    for (int i = 1; i <= arr[source]; i++) {
      ways = climbStairs(source + i, arr, dest, memo);
      totalways = totalways + ways;
    }

    memo[source] = totalways;

    return totalways;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(climbStairs(0, arr, n, new int[n + 1]));
  }
}
