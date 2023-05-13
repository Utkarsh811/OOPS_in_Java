package TcsDigital;

/*
 * Given a non-negative number n. The problem is to find the smallest number k such that the product of digits of k is equal to n. If no such number k can be formed then print “-1”.
Examples: 

Input : 100
Output : 455
Explanation: 4*5*5 = 100 and 455 is the
smallest possible number.

Input : 26
Output : -1
 */
import java.util.*;

public class code2 {

  public static String findsmallest(int num) {
    String val = "";
    Stack<Integer> stck = new Stack<>();
    //case 2 when num<10
    if (num >= 1 && num <= 9) {
      num = num + 10;

      val = val + num;
      return val;
    }

    //case 1 when n>10
    if (num > 10) {
      for (int i = 9; i >= 2; i--) {
        if (num % i == 0) {
          num = num / i;
          stck.push(i);
          while (num % i == 0) {
            num = num / i;
            stck.push(i);
            continue;
          }
          if (num == 1) break;
        }
      }
    }
    if (num != 1) {
      val = "not possible";
      return val;
    }

    System.out.println(stck);

    //case3 when num>10
    if (num == 1) {
      while (!stck.isEmpty()) {
        val = val + stck.pop();
      }
    }
    return val;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(findsmallest(a));
  }
}
