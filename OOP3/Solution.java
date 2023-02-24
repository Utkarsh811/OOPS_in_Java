package OOP3;

import java.util.*;

public class Solution {

  public static int method1(Hotel[] obj1, String p1) {
    int count = 0;
    //getting month
    for (Hotel trav : obj1) {
      String date = trav.getdate(trav);
      String month = date.substring(3, 6);
      //System.out.println(month);
      if (p1.equals(month)) {
        count = count + trav.getnor(trav);
      }
    }
    return count;
  }

  public static Hotel method2(Hotel[] obj2, String p2) {
    Hotel res = new Hotel();
    res = null;
    ArrayList<Double> arr = new ArrayList<>();
    for (Hotel trav : obj2) {
      if (p2.equals(trav.getwifif(trav))) arr.add(trav.gettotalb(trav));
    }
    if (arr.size() != 0) {
      Collections.sort(arr, Collections.reverseOrder());
      //System.out.println(arr);
      double val = arr.get(1);
      for (Hotel trav : obj2) {
        if (trav.gettotalb(trav) == val) {
          res = trav;
          return res;
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Hotel[] hot = new Hotel[4];

    //code to read values
    //code to call required method
    for (int i = 0; i < 4; i++) {
      int hid = sc.nextInt();
      sc.nextLine();
      String hname = sc.nextLine();
      String dob = sc.nextLine();
      int nor = sc.nextInt();
      sc.nextLine();
      String wifif = sc.nextLine();
      double totalb = sc.nextDouble();
      sc.nextLine();
      hot[i] = new Hotel(hid, hname, dob, nor, wifif, totalb);
    }
    String p1 = sc.nextLine();
    String p2 = sc.nextLine();
    int res = method1(hot, p1);
    if (res == 0) System.out.println(
      "No rooms booked in the given month"
    ); else System.out.println(res);

    Hotel rest = new Hotel();
    rest = method2(hot, p2);
    if (rest == null) {
      System.out.println("No id");
    } else {
      System.out.println(rest.getid(rest));
    }
    //code to display the result
  }
  //code the first method

  //code the second method

}

//code the class
class Hotel {

  private int hid;
  private String hname;
  private String dob;
  private int nor;
  private String wifif;
  private double totalb;

  public Hotel() {}

  public Hotel(
    int hid,
    String hname,
    String dob,
    int nor,
    String wifif,
    double totalb
  ) {
    this.hid = hid;
    this.hname = hname;
    this.dob = dob;
    this.nor = nor;
    this.wifif = wifif;
    this.totalb = totalb;
  }

  public static int getnor(Hotel obj) {
    return obj.nor;
  }

  public static String getdate(Hotel obj) {
    return obj.dob;
  }

  public static String getwifif(Hotel obj) {
    return obj.wifif;
  }

  public static double gettotalb(Hotel obj) {
    return obj.totalb;
  }

  public static int getid(Hotel obj) {
    return obj.hid;
  }
}
