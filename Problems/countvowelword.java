package Problems;

import java.util.*;

public class countvowelword {

  public static void main(String[] args) {
    char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    //converting string to array of string
    int count = 0;
    String[] arr = line.split(" ", -1);
    System.out.println(arr);
    for (String a : arr) {
      System.out.println(a);
      if (Arrays.toString(vowels).contains(String.valueOf(a.charAt(0)))) {
        count++;
      }
    }
    System.out.println(Arrays.toString(vowels));
    System.out.println(count);
  }
}
