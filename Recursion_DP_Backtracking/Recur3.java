package Recursion_DP_Backtracking;

import java.util.*;

//It is really importantto understand ,how this code actually works
public class Recur3 {

  public static void print(int n) { //5
    if (n == 0) {
      return; //returning means pop out from the stack
    }
    print(n - 1); //4
    if (n == 5) {
      System.out.println(n);
    } else {
      System.out.print(n + "->");
    }
    return; //1,2,3,4,5
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print(n); //5
    sc.close();
  }
}
