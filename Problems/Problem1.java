package Problems;

import java.util.*;

public class Problem1 {

  public static int method1(int range1, int range2) {
    int count = (range2 - range1) + 1;
    ArrayList<Integer> arr = new ArrayList<>();
    if (range1 <= 10) {
      for (int i = 11; i <= range2; i++) {
        arr.clear();
        //breaking each number to identify duplicate digit
        int valu = i;
        while (valu > 0) {
          int lastdig = valu % 10;
          if (arr.contains(lastdig)) {
            count--;
            break;
          } else {
            arr.add(lastdig);
          }
          valu = valu / 10;
        }
      }
    } else {
      for (int i = range1; i <= range2; i++) {
        //breaking each number to identify duplicate digit
        arr.clear();
        int val = i;
        while (val > 0) {
          int lastdig = val % 10;
          if (arr.contains(lastdig)) {
            count--;
            break;
          } else {
            arr.add(lastdig);
          }
          val = val / 10;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //accepting range
    int range1 = sc.nextInt();
    int range2 = sc.nextInt();
    System.out.println(method1(range1, range2));
    sc.close();
  }
}
