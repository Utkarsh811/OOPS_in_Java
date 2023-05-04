package Recursion_DP_Backtracking.ZigZagRecursionPattern;

//Very import to undertsand Recursion Call
import java.util.*;

public class ZigZag {

  public static void printzigzag(int n) {
    //Base Condition
    if (n == 0) {
      return;
    }

    /*Pre Area*/
    System.out.println("PRE->" + n); //1

    //LEFT CALL
    printzigzag(n - 1); //2

    /*In area*/
    System.out.println("IN->" + n); //3

    //RIGHT CALL
    printzigzag(n - 1); //4
    /*Post Area */
    System.out.println("POST->" + n); //5
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printzigzag(n);
  }
}
