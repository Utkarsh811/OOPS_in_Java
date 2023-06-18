package Polymorphism;

//import javax.sql.rowset.spi.SyncResolver;

public class Main {

  public static void main(String[] args) {
    //Typecasting

    int a = 3; //3 stored in 32 bit block
    long b = a; // 32 bits block transfered to 64 bits block
    System.out.println(b); //Implicit conversion

    long c = 4; //4 stored in 64 bit block
    int d = (int) c; //64 bit block transferred to 32 bit block that cannot be possible so need to do explicit conversion
    System.out.println(d);

    //creating the object
    Overloading ob = new Overloading();
    System.out.println(ob.add(2.2, 2.2));

    Overriding objover = new Overriding();
    objover.add(8, 8);
  }
}
