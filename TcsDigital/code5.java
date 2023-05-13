package TcsDigital;

//Rotating the matrix by 90 degree clockwise

//idea is to tranpose the matrix and then reverse it
import java.util.*;

public class code5 {

  public static int[][] TransposeOfMatrix(int[][] matrix) {
    int rows = matrix[0].length; //actually cols
    int cols = matrix.length; //actually rows
    int[][] newm = new int[rows][cols];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        newm[j][i] = matrix[i][j];
      }
    }
    return newm;
  }

  public static void Rotating90degreesClockwise(int[][] matrix) {
    int[][] mat = new int[matrix[0].length][matrix.length];
    mat = TransposeOfMatrix(matrix);
    System.out.println("TRANSPOSE OF A MATRIX");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ,");
      }
      System.out.println();
    }
    int[][] tam = new int[matrix[0].length][matrix.length];

    //reversing the matrix row wise
    for (int i = 0; i < mat.length; i++) {
      for (int j = mat[i].length - 1; j >= 0; j--) {
        int z = mat[i].length - 1;
        tam[i][z - j] = mat[i][j];
      }
    }
    //Result-:
    System.out.println("RESULT-:");

    for (int i = 0; i < tam.length; i++) {
      for (int j = 0; j < tam[i].length; j++) {
        System.out.print(tam[i][j] + " ,");
      }
      System.out.println();
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
        System.out.println("enter the value" + i + j);
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("ORIGINAL MATRIX");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ,");
      }
      System.out.println();
    }

    Rotating90degreesClockwise(matrix);
  }
}
