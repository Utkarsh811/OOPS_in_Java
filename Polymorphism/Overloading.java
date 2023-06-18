package Polymorphism;

public class Overloading {

  int value;
  String foxval;

  //instance variables

  public Overloading() {
    System.out.println("Invoking constructor");
  }

  //methods
  public int add(int a, int b) {
    System.out.println("This return int");
    return a + b;
  }

  public double add(double a, double b) {
    System.out.println("this return double");
    return a + b;
  }
}
