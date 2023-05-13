package TcsDigital;

//MATRIX DIAGONAL DIFFERENCE

import java.util.*;

public class code1 {

  public static int absoluteDiagnolsDifference(int[][] matrix) {
    int dsum1 = 0;
    int dsum2 = 0;
    System.out.println("the length is" + matrix.length);
    //calculating d1

    for (int r = 0; r < matrix.length; r++) {
      dsum1 = dsum1 + matrix[r][r];
    }
    //calculating d2
    for (int c = 0; c < matrix.length; c++) {
      dsum2 = dsum2 + matrix[c][matrix.length - 1 - c];
    }
    System.out.println(dsum1 + "," + dsum2);
    return Math.abs(dsum1 - dsum2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows and columns for square matrix");
    int rc = sc.nextInt();
    int[][] matrix = new int[rc][rc];
    for (int i = 0; i < rc; i++) {
      for (int j = 0; j < rc; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println(absoluteDiagnolsDifference(matrix));
  }
}
