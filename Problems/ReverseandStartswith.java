package Problems;

/*
 * str="Chahello"
 * print olleh if startswith Cha
 * else
 * NA
 */
import java.util.*;

public class ReverseandStartswith {

  public static String reverse(String s) {
    String rev = "";
    for (int i = 0; i < s.length(); i++) {
      rev = s.charAt(i) + rev;
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if (str.startsWith("Cha")) {
      String s = str.substring(3);
      System.out.println(reverse(s));
    } else {
      System.out.println("NA");
    }
  }
}
