package Recursion_DP_Backtracking;

import java.util.*;

public class TowerOfHanoi {

  public static void Move(int n, String Ta, String Tb, String Tc) {
    if (n == 0) {
      return;
    }
    /*Faith is that  n-1 knows to move from A  to B */

    Move(n - 1, Ta, Tc, Tb);
    System.out.println(n + " move from " + Ta + "->" + Tb);
    Move(n - 1, Tc, Tb, Ta);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int noOfDiscs = sc.nextInt();
    String TowerA = "A";
    String TowerB = "B";
    String TowerC = "C";

    Move(noOfDiscs, TowerA, TowerB, TowerC);
  }
}
