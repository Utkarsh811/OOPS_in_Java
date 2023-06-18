package Recursion_DP_Backtracking.Dynamic_Programming;

import java.util.*;

public class Tribonacci_sequence {

  public static int Tribonacci(int[] bucket, int n) {
    if (bucket[n] != 0) {
      return bucket[n];
    }
    if (n <= 1) {
      return n;
    }
    if (n == 2) {
      return 1;
    } else {
      int v0 = Tribonacci(bucket, n - 3);
      int v1 = Tribonacci(bucket, n - 2);
      int v2 = Tribonacci(bucket, n - 1);
      int res = v0 + v1 + v2;
      bucket[n] = res;

      return res;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] bucket = new int[n + 1];
    System.out.println(Tribonacci(bucket, n));
    System.out.println(Arrays.toString(bucket));
  }
}
