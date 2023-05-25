import java.util.*;

public class prac {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int paths = countPaths(arr, 0, n);
    System.out.println(paths);
    scn.close();
  }

  public static int countPaths(int[] arr, int index, int len) {
    if (index == len) {
      return 1;
    }
    int count = 0;
    for (int jump = 1; jump <= arr[index]; jump++) {
      if ((jump + index) <= len) {
        count += countPaths(arr, jump + index, len);
      } else {
        break;
      }
    }
    return count;
  }
}
