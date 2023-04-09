package OOP5;

import java.util.*;

//import javax.lang.model.util.ElementScanner14;

class laptopidcomparator implements Comparator<Laptop> {

  public int compare(Laptop a, Laptop b) {
    if (a.get_lapid(a) == b.get_lapid(b)) {
      return 0;
    } else if (a.get_lapid(a) > b.get_lapid(b)) {
      return 1;
    } else {
      return 0;
    }
  }
}

public class Solution {

  public static int countOfLaptopsByBrand(Laptop[] laparr, String param1) {
    int count = 0;
    for (Laptop lp : laparr) {
      if (lp.get_brand(lp).equals(param1) && lp.get_rating(lp) > 3) {
        count++;
      }
    }
    return count;
  }

  public static ArrayList<Laptop> searchLaptopByOsType(
    Laptop[] laparr,
    String param2
  ) {
    //creating another Laptop object array
    ArrayList<Laptop> newarr = new ArrayList<>();

    for (Laptop lp : laparr) {
      if (lp.get_os(lp).equals(param2)) {
        newarr.add(lp);
      }
    }
    if (newarr.size() == 0) return null;

    //sorting newarr with respect to laptopid

    Collections.sort(newarr, new laptopidcomparator());
    System.out.println("------------------OUTPUT---------------------");

    for (Laptop a : newarr) {
      System.out.println(a.get_lapid(a) + a.get_os(a));
    }

    return newarr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Laptop[] laparr = new Laptop[4];
    for (int i = 0; i < 4; i++) {
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      double d = sc.nextDouble();
      sc.nextLine();
      int e = sc.nextInt();
      sc.nextLine();
      laparr[i] = new Laptop(a, b, c, d, e);
    }
    String param1 = sc.nextLine();
    int cnt = countOfLaptopsByBrand(laparr, param1);
    System.out.println("------------------OUTPUT---------------------");
    if (cnt == 0) {
      System.out.println("noting");
    } else {
      System.out.println(cnt);
    }

    String param2 = sc.nextLine();
    ArrayList<Laptop> arr = new ArrayList<>();
    arr = (ArrayList<Laptop>) searchLaptopByOsType(laparr, param2).clone();
    if (arr != null) for (Laptop l : arr) {
      System.out.println(l.get_lapid(l));
      System.out.println(l.get_rating(l));
    } else {
      System.out.println("nooting");
    }
  }
}

class Laptop {

  private int laptopid;
  private String brand;
  private String osType;
  private double price;
  private int rating;

  public Laptop() {}

  public Laptop(int a, String b, String c, double d, int e) {
    this.laptopid = a;
    this.brand = b;
    this.osType = c;
    this.price = d;
    this.rating = e;
  }

  public static String get_brand(Laptop lp) {
    return lp.brand;
  }

  public static int get_rating(Laptop lp) {
    return lp.rating;
  }

  public static String get_os(Laptop lp) {
    return lp.osType;
  }

  public static int get_lapid(Laptop lp) {
    return lp.laptopid;
  }
}
