
//1603. Design Parking System
package Leetcodeproblems;
import java.util.*;
public class ParkingSystem {
     private static int big;
    private static int medium;
    private static int small; 

    //contructors
    public  ParkingSystem()
    {
        
    }

    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
        
    }
    
    public static boolean addCar(int carType) {
        int value=0;
        // ParkingSystem newobj=new ParkingSystem();
        if(carType==1){
            //this.big;
            value=big;

            if(value>0)
            {
                //value--;
                big--;
                return true;
            }
            else{
                return false;
            }
            

        }
        if(carType==2)
        {
            value=medium;
            if(value>0)
            {
                //value--;
                medium--;
                return true;
            }
            else{
                return false;
            }

        }
        if(carType==3)
        {
            value=small;
             
            if(value>0)
            {
                //value--;
                small--;
                return true;
            }
            else{
                return false;
            }

        }
        return false;
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Big=sc.nextInt();
        int Medium=sc.nextInt();
        int Small=sc.nextInt();

        ParkingSystem ps1=new ParkingSystem(Big,Medium,Small);
        int type=sc.nextInt();
        System.out.println(addCar(type));

    }


}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */