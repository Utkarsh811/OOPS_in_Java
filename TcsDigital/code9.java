package TcsDigital;

import java.util.*;

public class code9 {

  public static void Rotating90degreesClockwise(int[][] matrix) {
    int[][] mat = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        mat[i][j] = matrix[matrix[i].length - j - 1][i];
      }
    }
    System.out.println("ROTATED MATRIX-90 ");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ,");
      }
      System.out.println();
    }
  }

  public static void Rotating180degreesClockwise(int[][] matrix) {
    int[][] mat = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        mat[i][j] = matrix[matrix[i].length - i - 1][matrix[i].length - j - 1];
      }
    }
    System.out.println("ROTATED MATRIX-180 ");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ,");
      }
      System.out.println();
    }
  }

  public static void Rotating270degreesClockwise(int[][] matrix) {
    int[][] mat = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        mat[i][j] = matrix[j][matrix[i].length - i - 1];
      }
    }
    System.out.println("ROTATED MATRIX-270 ");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ,");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n x n matrix");
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
    System.out.println("Choose 1 for 90 degree");
    System.out.println("Choose 2 for 180 degree");
    System.out.println("Choose 3 for 270 degree");
    System.out.println("Enter your choice");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        Rotating90degreesClockwise(matrix);
        break;
      case 2:
        Rotating180degreesClockwise(matrix);
        break;
      case 3:
        Rotating180degreesClockwise(matrix);
        break;
      default:
        System.out.println("Not possible");
    }
  }
}
