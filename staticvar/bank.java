package staticvar;
//import java.util.*;

public class bank {
    static double rateofinterest=4.2;
    String username;
    String password;
    double amount;
    int id;

    //constructor
    public bank(String username,String password,double amount,int id){
        System.out.println("Constructor called");
        this.username=username;
        this.password=password;
        this.amount=amount;
        this.id=id;


    }
    public static String roi(){
        
        String str="";
        str=String.format("the rate of insterest of our bank is %f", rateofinterest);
        return str;
    }

    
}
