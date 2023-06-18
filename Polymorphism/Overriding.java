package Polymorphism;

public class Overriding extends Overloading {

  public Overriding() {
    System.out.println("Invoking Overriding constructor");
  }

  @Override
  //method
  public int add(int a, int b) {
    System.out.println(
      "This return int but method is overidden in Overridding class"
    );
    return a + b;
  }
}
