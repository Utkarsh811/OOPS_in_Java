package OOP6;

import java.util.*;

public class Solution {

  // method1

  public static int countoflaptopsbybrand(Laptop[] larr, String brand) {
    // brand and rating>3
    int count = 0;

    for (Laptop ob : larr) {
      if (ob.get_rating(ob) > 3 && brand.equalsIgnoreCase(ob.get_brand(ob))) {
        //System.out.println(ob.get_lapid(ob));
        count++;
      }
    }
    return count;
  }

  public static ArrayList<Laptop> searchLaptopbyOsType(
    Laptop[] larr,
    String os
  ) {
    // descending order wrt laptop id and same os
    ArrayList<Laptop> arr = new ArrayList<Laptop>();

    for (Laptop lp : larr) {
      // segregating laptops by os and pushing into the arraylist
      if (os.equalsIgnoreCase(lp.get_os(lp))) {
        arr.add(lp);
      }
    }

    // now sorting arr
    Collections.sort(arr, new laptopidcomparator());

    for (Laptop a : arr) {
      //System.out.println(a.get_lapid(a));
    }

    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // creating Laptop object array
    Laptop[] larr = new Laptop[4];
    for (int i = 0; i < 4; i++) {
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      String c = sc.nextLine();
      double d = sc.nextDouble();
      sc.nextLine();
      int e = sc.nextInt();
      sc.nextLine();
      // craeting Laptop object array elements
      larr[i] = new Laptop(a, b, c, d, e);
    }

    String brand = sc.nextLine();
    String os = sc.nextLine();

    int res = countoflaptopsbybrand(larr, brand);
    if (res == 0) {
      System.out.println("no");
    } else {
      System.out.println(res);
    }

    ArrayList<Laptop> raa = new ArrayList<>();

    raa = (ArrayList) searchLaptopbyOsType(larr, os).clone();
    if (raa.size() == 0) {
      System.out.println("noo");
    } else {
      System.out.println("arraylist is-:" + raa);
      for (Laptop a : raa) {
        System.out.println(
          "laptopid-:" + a.get_lapid(a) + " laptopratingg-:" + a.get_rating(a)
        );
      }
    }
  }
}

class laptopidcomparator implements Comparator<Laptop> {

  @Override
  public int compare(Laptop a, Laptop b) {
    if (a.get_lapid(a) == b.get_lapid(b)) return 0; else if (
      a.get_lapid(a) < b.get_lapid(b)
    ) return 1; else return -1;
  }
}

class Laptop {

  private int lap_id;
  private String brand;
  private String osType;
  private double price;
  private int rating;

  // contructor
  public Laptop() {}

  public Laptop(int a, String b, String c, double d, int e) {
    this.lap_id = a;
    this.brand = b;
    this.osType = c;
    this.price = d;
    this.rating = e;
  }

  // getters and setters method

  public int get_rating(Laptop lp) {
    return lp.rating;
  }

  public String get_brand(Laptop lp) {
    return lp.brand;
  }

  public int get_lapid(Laptop lp) {
    return lp.lap_id;
  }

  public String get_os(Laptop lp) {
    return lp.osType;
  }
}
