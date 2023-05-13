package TcsDigital;

import java.util.*;
import java.util.stream.*;

public class code3 {

  //Sorting Hashmap by values using stream
  public static HashMap<String, Integer> sortbyvalues(
    HashMap<String, Integer> hm
  ) {
    HashMap<String, Integer> temp = hm
      .entrySet()
      .stream()
      .sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
      .collect(
        Collectors.toMap(
          Map.Entry::getKey,
          Map.Entry::getValue,
          (e1, e2) -> e1,
          LinkedHashMap::new
        )
      );
    return temp;
  }

  public static void whowin(String str, HashMap<String, Integer> map) {
    String[] arr = str.split(" ", 0);
    String[] nrr = arr[2].split("-", 0);
    int val = 0;
    if (Integer.parseInt(nrr[0]) > Integer.parseInt(nrr[1])) {
      if (map.containsKey(arr[0])) {
        int value = map.get(arr[0]);
        map.put(arr[0], value + 3);
      } else {
        map.put(arr[0], 3);
      }
    }
    if (Integer.parseInt(nrr[0]) < Integer.parseInt(nrr[1])) {
      if (map.containsKey(arr[1])) {
        int value = map.get(arr[1]);
        map.put(arr[1], value + 3);
      } else {
        map.put(arr[1], 3);
      }
    }
    if (Integer.parseInt(nrr[0]) == Integer.parseInt(nrr[1])) {
      boolean flag = false;
      boolean glaf = false;

      if (map.containsKey(arr[0])) {
        int value = map.get(arr[0]);
        map.put(arr[0], value + 1);
        flag = true;
      }
      if (map.containsKey(arr[1])) {
        int value = map.get(arr[1]);
        map.put(arr[1], value + 1);
        glaf = true;
      }

      if (flag == false) {
        map.put(arr[0], 1);
      }
      if (flag == false) {
        map.put(arr[1], 1);
      }
    }
    //System.out.println(map);
    System.out.println(sortbyvalues(map));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    int times = ((n) * (n - 1)) / 2;
    System.out.println(times);
    while (times > 0) {
      String str = sc.nextLine();
      whowin(str, map);
      times--;
    }
  }
}
