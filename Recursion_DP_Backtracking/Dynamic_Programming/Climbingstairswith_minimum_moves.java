package Recursion_DP_Backtracking.Dynamic_Programming;

import java.util.*;

public class Climbingstairswith_minimum_moves {

  public static void minimumMoves(int n, int[] stepsSizearr) {
    //Creating a null array
    Integer[] minrecord = new Integer[n + 1];
    // System.out.println(Arrays.toString(minrecord));
    //from n to n minimum move is 0
    minrecord[n] = 0;
    for (int i = n - 1; i >= 0; i--) {
      int min = Integer.MAX_VALUE;
      int steps = stepsSizearr[i];
      if (steps == 0) {
        continue;
      } else {
        while (steps >= 1) {
          if (i + steps > n) {
            steps--;
            continue;
          }
          if (i + steps <= n) {
            if (minrecord[i + steps] == null) {
              steps--;
              continue;
            }
            if (min > minrecord[i + steps]) {
              min = minrecord[i + steps];
            }
            steps--;
          }
        }
        if (min != Integer.MAX_VALUE) {
          minrecord[i] = 1 + min;
        } else {
          minrecord[i] = null;
        }
        //System.out.println(minrecord[i]);
      }
    }
    // System.out.println(Arrays.toString(minrecord));
    System.out.println(minrecord[0]);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter destination");
    int n = sc.nextInt();
    sc.nextLine();
    int[] stepsSizearr = new int[n];
    System.out.println("Enter step size array");
    for (int i = 0; i < n; i++) {
      stepsSizearr[i] = sc.nextInt();
      sc.nextLine();
    }
    minimumMoves(n, stepsSizearr);
  }
}
