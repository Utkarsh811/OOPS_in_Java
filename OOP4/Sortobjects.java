package OOP4;

import java.util.*;

class markscomparator implements Comparator<Sortobjects> {

  @Override
  public int compare(Sortobjects ob1, Sortobjects ob2) {
    if (ob1.get_marks(ob1) == ob2.get_marks(ob2)) {
      return 0;
    } else if (ob1.get_marks(ob1) > ob2.get_marks(ob2)) {
      return 1;
    } else {
      return -1;
    } // ascending
  }
}

public class Sortobjects {

  private String Name;
  private int rollnum;
  private double marks;

  public Sortobjects() {}

  public Sortobjects(String a, int b, double c) {
    this.Name = a;
    this.rollnum = b;
    this.marks = c;
  }

  public static String get_name(Sortobjects ob) {
    return ob.Name;
  }

  public static int get_roll(Sortobjects ob) {
    return ob.rollnum;
  }

  public static double get_marks(Sortobjects ob) {
    return ob.marks;
  }
}

class main {

  public static void sortmethod(Sortobjects[] objects) {
    // arraylist of objects
    ArrayList<Sortobjects> arr = new ArrayList<>();
    for (Sortobjects trav : objects) {
      arr.add(trav);
    }
    System.out.println(arr);

    Collections.sort(arr, new markscomparator());
    for (Sortobjects a : arr) {
      System.out.println(a.get_name(a) + "-" + a.get_marks(a));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    Sortobjects[] objects = new Sortobjects[n];
    for (int i = 0; i < objects.length; i++) {
      System.out.println("enter Name-:");
      String a = sc.nextLine();
      System.out.println("Enter roll number");
      int b = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter marks");
      double c = sc.nextDouble();
      sc.nextLine();

      objects[i] = new Sortobjects(a, b, c);
    }

    sortmethod(objects);

    System.out.println(objects);
  }
}
