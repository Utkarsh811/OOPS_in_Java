package TcsDigital;

//check if string is pangram or not
import java.util.*;

public class code4 {

  public static boolean isPanagram(String str) {
    boolean result = true;

    int[] arr = new int[26];
    for (int i = 0; i < str.length(); i++) {
      int v = ((int) str.charAt(i)) - 97;
      arr[v] = arr[v] + 1;
    }

    for (int d : arr) {
      if (d > 0) {
        // System.out.println(d);
        continue;
      } else {
        result = false;
        break;
      }
    }
    //abcdefghijklmnopqrstuvwxyz
    //aaaaabbbbcddefggghijkkklmnooopqqrstuuuvwwxvzy

    //System.out.println((int) a + "," + (int) b);

    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(isPanagram(str));
  }
}
