import java.util.*;

public class prac {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 1; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    scn.close();
  }
}
