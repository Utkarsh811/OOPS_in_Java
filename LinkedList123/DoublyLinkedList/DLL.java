package LinkedList123.DoublyLinkedList;
import java.util.*;

//AS Linked list composed of nodes
public class DLL  {
    protected static Node Head=null;
    protected static Node Tail=null;
    private static int size=0;

    //constructors
    public DLL(){}

    public DLL(ArrayList<Integer> arr)
    {
        for(int i=0;i<arr.size();i++)
        {
            //creation of the node object
            Node node=new Node();
            //pushing the value in the node object
            node.push(arr.get(i));

        }

        

    
    }
    //getters and setters method
    public static void set_size()
    {
        size++;
    }

    public static int get_Size()
    {
        return size;
    }
    public static Node get_Head()
    {
        return Head;
    }
    public static void set_Head(Node nd)
    {
        Head=nd;
    }
    public static void set_Tail(Node nd)
    {
        Tail=nd;
    }

    public static Node get_Tail()
    {
        return Tail;
    }


    //methods

    public void print()
    {
        Node travpointer=Head;
        while(travpointer!=null)
        {
            if(travpointer.get_leftnext()==null)
            {
                System.out.print(travpointer.get_data());
                travpointer=travpointer.get_leftnext();

            }
            else{
            System.out.print(travpointer.get_data()+"-> <-");
            travpointer=travpointer.get_leftnext();
            }

        }
        
    }
    



    
}
