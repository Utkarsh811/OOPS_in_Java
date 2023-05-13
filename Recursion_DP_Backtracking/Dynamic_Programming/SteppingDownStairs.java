package Recursion_DP_Backtracking.Dynamic_Programming;

import java.util.*;

public class SteppingDownStairs {

  public static ArrayList<String> findwaystogo(
    int noOfstairs,
    ArrayList<ArrayList<String>> matrix
  ) {
    //BASE CASES
    if (noOfstairs == 0) {
      ArrayList<String> rr = new ArrayList<>();
      rr.add(""); //of size 1
      return rr;
    }

    if (noOfstairs < 0) {
      ArrayList<String> er = new ArrayList<>();

      return er;
    }
    if (matrix.get(noOfstairs).size() != 0) {
      return matrix.get(noOfstairs);
    }
    //System.out.println("hello" + noOfstairs);

    ArrayList<String> path1 = findwaystogo(noOfstairs - 1, matrix);
    ArrayList<String> path2 = findwaystogo(noOfstairs - 2, matrix);
    ArrayList<String> path3 = findwaystogo(noOfstairs - 3, matrix);

    ArrayList<String> arr = new ArrayList<>();

    for (String a : path1) {
      arr.add(1 + a);
    }

    for (String a : path2) {
      arr.add(2 + a);
    }
    for (String a : path3) {
      arr.add(3 + a);
    }

    matrix.add(noOfstairs, arr);

    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int noOfstairs = sc.nextInt();
    ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
    for (int i = 0; i < noOfstairs * 4; i++) {
      matrix.add(new ArrayList<String>());
    }

    System.out.println(findwaystogo(noOfstairs, matrix));
  }
}
