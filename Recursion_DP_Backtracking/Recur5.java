package Recursion_DP_Backtracking;

import java.util.*;
import javax.sql.rowset.spi.SyncResolver;

//expectation
/*f(x)=
 * 5
 * 4
 * 3
 * 2
 * 1
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class Recur5 {

  public static void print(int n) {
    //whatever present here will being processed when call stack is going up .
    if (n == 0) {
      return;
    }
    System.out.println(n);
    System.out.println("!");
    System.out.println("V");
    print(n - 1);
    //whatever present here will being processed when callstack is going down and function is returning.
    if (n == 5) {
      System.out.println(n);
    } else {
      System.out.println(n);
      System.out.println("!");
      System.out.println("V");
    }

    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print(n);
  }
}
