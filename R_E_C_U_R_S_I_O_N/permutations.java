package R_E_C_U_R_S_I_O_N;

//import java.security.AllPermission;
import java.util.*;

public class permutations {

  static ArrayList<String> res = new ArrayList<>();

  public static void Allpermutation(String str, String ch) {
    //base case
    if (str.length() == 0) {
      //System.out.println(ch);
      res.add(ch);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      String rests = str.substring(0, i) + str.substring(i + 1);
      Allpermutation(rests, ch + c);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    Allpermutation(s1, "");
    System.out.println(res);
  }
}
