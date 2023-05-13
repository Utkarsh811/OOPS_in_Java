package TcsDigital;

//SPIRAL MATRIX 1 TRAVERSAL
import java.util.*;

public class code6 {

  public static void spriraltraverse(int[][] matrix) {
    //The matrix is-:
    System.out.println("The Matrix is-:  ");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ,");
      }
      System.out.println();
    }
    //initial coditions

    int direction = 0;
    int top = 0;
    int down = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= down && left <= right) {
      if (direction == 0) {
        for (int i = left; i <= right; i++) {
          System.out.println(matrix[top][i]); //1,2,3,4
        }
        //increase the top
        top++;
      }
      if (direction == 1) {
        for (int i = top; i <= down; i++) {
          System.out.println(matrix[i][right]); //8,12,16
        }
        right--;
      }
      if (direction == 2) {
        for (int i = right; i >= left; i--) {
          System.out.println(matrix[down][i]); //15,14,13
        }
        down--;
      }
      if (direction == 3) {
        for (int i = down; i >= top; i--) {
          System.out.println(matrix[i][left]); //9,5
        }
        left++;
      }

      direction = (direction + 1) % 4;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    sc.nextLine();
    int cols = sc.nextInt();
    sc.nextLine();
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
        sc.nextLine();
      }
    }

    spriraltraverse(matrix);
  }
}
//https://leetcode.com/problems/spiral-matrix-ii/description/
