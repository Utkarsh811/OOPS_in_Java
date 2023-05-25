package R_E_C_U_R_S_I_O_N;

public class Rec1 {

  public static void method(int n) {
    //Base Condition
    if (n == 0) {
      return;
    }
    System.out.println(n); //--1
    method(n - 1); //--2
    // Whenever function return as it executes base conditions ,it comes here

    //--3
    System.out.println(
      "hello" + "I am returning now " + "the value is n is" + n
    );
  }

  public static void main(String[] args) {
    method(10);
  }
}
