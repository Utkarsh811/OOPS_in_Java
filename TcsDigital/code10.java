package TcsDigital;

import java.util.*;

public class code10 {

  public static void method(int[] arr) {
    int[] nr = arr.clone();
    Arrays.sort(nr);
    int val = nr[0];
    int[] ar = new int[arr.length];
    int i;
    System.out.println("size of" + ar.length);
    for (i = 0; i < arr.length; i++) {
      if (arr[i] % val == 0) {
        int v = arr[i] / val;
        ar[i] = v;
      } else {
        break;
      }
    }
    System.out.println("dff" + i);
    if (i == arr.length) {
      System.out.println(Arrays.toString(ar));
    } else {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    method(arr);
  }
}
