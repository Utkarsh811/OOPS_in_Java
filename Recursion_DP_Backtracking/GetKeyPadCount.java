package Recursion_DP_Backtracking;

/*
 * user type 573
 * expectation is method(573)=> should give output of all cartesiam product of string
 *
 * 5  7  3
 * j  t  d
 * k  u  e
 * l  v  f           resultant is 3*3*3=27 cominations
 *
 * faith
 *
 * method(73) knows how to find its combinations
 * method(3)=> {d , e ,f}
 *
 *
 * faith and expectation matching
 * 5 catersian product with method(73) output
 */

import java.util.*;

public class GetKeyPadCount {

  //keypad numbers corresponding letters
  static String[] arr = {
    "_",
    "~",
    "abc",
    "def",
    "ghi",
    "jkl",
    "mno",
    "pqrs",
    "tuv",
    "wxyz",
  };

  //method
  public static ArrayList<String> FindCombinations(String str) {
    /*BASE CASE */

    if (str.length() < 1 && str != "") {
      return new ArrayList<String>();
    }
    if (str == "") {
      ArrayList<String> rrr = new ArrayList<>();
      rrr.add("");
      return rrr;
    }

    char ch = str.charAt(0); //1
    String substr = str.substring(1); //2

    ArrayList<String> subarr = FindCombinations(substr); //3

    ArrayList<String> nrr = new ArrayList<>(); //4
    String corres = arr[Integer.parseInt(String.valueOf(ch))]; //5
    for (int i = 0; i < corres.length(); i++) { //6
      for (String a : subarr) {
        nrr.add(corres.charAt(i) + a);
      }
    }

    return nrr; //7
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the digits entered in keypad -:");
    String digits = sc.nextLine();
    ArrayList<String> arr = FindCombinations(digits);
    System.out.println(arr);
    System.out.println(arr.size());
  }
}
