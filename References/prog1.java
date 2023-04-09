package References;

import java.util.*;

//va

public class prog1 {

  public static void swap(int a, int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //variable
    int a = 10;
    int b = a;
    System.out.println("a=" + " " + a);
    System.out.println("b=" + " " + b);

    //now assigning b as 25 will iy=t affect a?
    b = 25;
    System.out.println("a=" + " " + a);
    System.out.println("b=" + " " + b);

    //Result is No , Both a and b gets separate memeory address block so referencing here

    String name = "utkarsh";
    String id = name;
    System.out.println("name=" + " " + name);
    System.out.println("id=" + " " + id);

    id = "Vinay";
    System.out.println("name=" + " " + name);
    System.out.println("id=" + " " + id);

    int var1 = 20;
    int var2 = 35;
    swap(var1, var2);
    System.out.println("var1=" + " " + var1);
    System.out.println("var2=" + " " + var2);
    //ALL THESE EXAMPLES ARE OF PASS BY VALUE

  }
}
