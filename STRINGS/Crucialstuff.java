package STRINGS;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Crucialstuff {

  public static void main(String[] args) {
    String a = "Utkarsh"; //this string object "Utkarsh" allocated the space in Stringpool inside heap
    //here String is data type
    // a is reference variable stored in stack memory pointing or referencing to the object "Utkarsh" in heap memory

    String b = "Utkarsh";
    //both a and b from stack memory are pointing to the same object "Utkarsh" stored inside the stringpool in heap memory
    //point to be noted there is no separate  object creation occured here

    //== -> comparator operator it checks whether variables pointing to the same object or not
    System.out.println(a == b); //true
    String c = "Buddy";
    System.out.println(a == c); //false as there are 2 objects "Utkarsh" and "Buddy" inside stringpool

    //using new keyword we tell the jvm to allocate the string object memory outside the small cache string contant pool
    String x = new String("venom");
    String y = new String("venom");
    System.out.println(x == y);
    System.out.println(x.equals(y)); //when you only need to check values.
    System.out.println(Arrays.toString(new int[] { 3, 4, 5, 2 }));
    //StringBuilder are mutable.

    /*SOME METHODS PROVIDED BY THE STRING */
    String str = "Utkarsh";
    System.out.println(str == a);
    System.out.println("line 33" + "->" + str);
    char[] carr = str.toCharArray();
    System.out.println(Arrays.toString(carr));
    String rts = str.toLowerCase();
    System.out.println(rts);
    str = "woaoo you are a good guy   ";
    System.out.println(Arrays.toString(str.split(" ", 0)));
    System.out.println(str.trim());
    System.out.println(str.trim().length());
  }
}
