/*Problem Statement:

You are given scores of a football league among a set of teams. You need to find the winner of the league and print the name of the winner and points earned by the team. Each team gets 3 points for a win, 1 point for a draw and 0 for loss. The name of the team is represented as uppercase characters viz., A B Z

Constraints:

There will be only one team which gets the highest points.

Input:

There are many lines in the input.

The first line contains an integer N, representing number of teams in the league. The next (N(N-1)/2 lines contain

three space separated strings <Team 1, Team 2, Score>

Here,

Team 1 is the name of the home team.

Team 2 is the name of the away team.

Score represents the score of the match, (M-N), where M represents the score of the home team and N represents the score of the away team.

Output: The output should have two lines.

The first line should contain a character representing the name of the leader team The second line containing an integer representing the points won by the leader team */

package TcsDigital;

import java.util.*;
import javax.lang.model.util.ElementScanner14;

public class code8 {

  public static void FindWinner(String str, HashMap<String, Integer> map) {
    String[] strarr = str.split(" ", 0);
    String[] starr = strarr[2].split("-", 0);
    int val1 = Integer.parseInt(starr[0]);
    int val2 = Integer.parseInt(starr[1]);

    if (val1 > val2) {
      int vl = map.get(strarr[0]);
      map.put(strarr[0], vl + 3);
    } else if (val2 > val1) {
      int vl = map.get(strarr[1]);

      map.put(strarr[1], vl + 3);
    } else {
      int vl = map.get(strarr[0]);

      map.put(strarr[0], vl + 1);
      vl = map.get(strarr[1]);
      map.put(strarr[1], vl + 1);
    }
    System.out.println(map);
    //sort the hashmap by values
    ArrayList<Integer> list = new ArrayList<>();
    LinkedHashMap<String, Integer> pam = new LinkedHashMap<>();
    for (Map.Entry<String, Integer> enter : map.entrySet()) {
      list.add(enter.getValue());
    }
    Collections.sort(list, Collections.reverseOrder());
    for (int a : list) {
      for (Map.Entry<String, Integer> en : map.entrySet()) {
        if (en.getValue() == a) {
          pam.put(en.getKey(), a);
        }
      }
    }
    System.out.println(pam);
    for (Map.Entry<String, Integer> e : pam.entrySet()) {
      System.out.println(e.getKey() + "," + e.getValue());
      break;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = "";
    int i = 1;
    String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    HashMap<String, Integer> map = new HashMap<>();
    for (int j = 0; j < n; j++) {
      map.put(String.valueOf(abc.charAt(j)), 0);
    }
    while (i <= (n * n - 1) / 2) {
      str = sc.nextLine();
      FindWinner(str, map);
      i++;
    }
  }
}
