package LinkedList123.DoublyLinkedList;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] instructions=
        {
            "For creating list type -:PUSH 123 here 123 is element",
            "For pushing elements in created list type -: CREATE"
        };

        ArrayList<Integer> arr=new ArrayList<>();
        int value=0;
        String str="";
        DLL dLL1=null;


        String cmd=sc.nextLine();
        while(!cmd.startsWith("END"))
        {
            //Pushing elements in doublylinked list
            //PUSH 123
            if(cmd.startsWith("PUSH"))
            {
                str=cmd.substring(5);
                value=Integer.parseInt(str);
                System.out.println("Pushing "+value+"...");
                arr.add(value);
            }
            //creation of linked list by the elements which are pushed
            if(cmd.startsWith("CREATE"))
            {
                //creation of doubly Linked List 
                //Creating object of class DLL

                dLL1 =new DLL(arr);
                System.out.println("Creating...");
                
                 


            }

            if(cmd.startsWith("SHOW"))
            {
                System.out.println("Showing...");
                dLL1.print();
            }
            cmd=sc.nextLine();



        }
        



        

        
    }
    
}
