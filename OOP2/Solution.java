package OOP2;
import java.util.*;

public class Solution {

    public static int totalNoOfRoomsBooked(Motel[] obj, String param)
    {
        int count=0;
    
        for(Motel traverse:obj)
        {

            if(traverse.getnoOfRoomsBooked(traverse)>5 && param.equals(traverse.getcabFacility(traverse)))
            {
                count=count+traverse.getnoOfRoomsBooked(traverse);

            }
          

        }
        return count;


    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Motel[] mot=new Motel[4];
        for(int i=0;i<4;i++)
        {
            int mid=sc.nextInt();sc.nextLine();
            String mname=sc.nextLine();
            String mdate=sc.nextLine();
            int nr=sc.nextInt();sc.nextLine();
            String cf=sc.nextLine();
            double tb=sc.nextDouble();sc.nextLine();
            mot[i]=new Motel(mid,mname,mdate,nr,cf,tb);




        }
        System.out.println("tell me cabfacility-:");
        String cabfacil=sc.nextLine();


        int result=totalNoOfRoomsBooked(mot,cabfacil);
        if(result>0)
        {
            System.out.println(result);
        }
        if(result==0)
        {
            System.out.println("No such room");
        }

       

        
        
        


    }
    
}
