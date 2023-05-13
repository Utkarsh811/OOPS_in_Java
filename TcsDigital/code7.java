package TcsDigital;

//LEETCODE 59 SPIRAL MATRIX 2
import java.util.*;

public class code7 {

  public static int[][] generateMatrix(int n) {
    //create the matrix
    int[][] matrix = new int[n][n];
    //Initially
    int top = 0;
    int down = n - 1;
    int left = 0;
    int right = n - 1;
    int direction = 0;
    //now loop started
    int val = 1;
    while (val <= n * n && top <= down && left <= right) {
      if (direction == 0) {
        for (int i = left; i <= right; i++) {
          matrix[top][i] = val;
          val++;
        }
        top++;
      }
      if (direction == 1) {
        for (int i = top; i <= down; i++) {
          matrix[i][right] = val;
          val++;
        }
        right--;
      }
      if (direction == 2) {
        for (int i = right; i >= left; i--) {
          matrix[down][i] = val;
          val++;
        }
        down--;
      }
      if (direction == 3) {
        for (int i = down; i >= top; i--) {
          matrix[i][left] = val;
          val++;
        }
        left++;
      }

      direction = (direction + 1) % 4;
    }
    return matrix;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Arrays.toString(generateMatrix(n)));
  }
}
