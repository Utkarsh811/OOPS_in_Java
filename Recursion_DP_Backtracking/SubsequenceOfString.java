package Recursion_DP_Backtracking;

/*
 * Subsequences of a string
 *    str="abc"   no of subsequences = 2^ length of string =2^3  <Gap can possible>
 *     1) _ _ _     0 0 0
 *     2) a _ _     1 0 0  true false false   a aega  b nhi aega  c nhi aega
 *     3) _ b _     0 1 0
 *     4) _ _ c     0 0 1
 *     5) a b _     1 1 0
 *     6) _ b c     0 1 1
 *     7) a _ c     1 0 1
 *     8) a b c     1 1 1
 *
 *Noted that substring of abc are -: a,ab,abc,b,bc,c      n*(n-1)/2 < Gap cannot possible>
 */
import java.util.*;

public class SubsequenceOfString {

  public static ArrayList<String> findSubstring(String str) {
    //BASE CASE
    if (str == "") {
      ArrayList<String> arr = new ArrayList<>();
      arr.add("");
      return arr;
    }

    char ch = str.charAt(0); //1
    String substr = str.substring(1); //2
    ArrayList<String> templist = findSubstring(substr); //3

    //adding
    ArrayList<String> newlist = new ArrayList<>();
    for (String a : templist) {
      newlist.add("" + a);
      newlist.add(ch + a);
    }
    return newlist;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(findSubstring(str));
  }
}
