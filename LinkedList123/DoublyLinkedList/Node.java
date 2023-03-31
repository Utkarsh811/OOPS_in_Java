package LinkedList123.DoublyLinkedList;
//DLL IS SUPER CLASS AND Node is subclass
public class Node extends DLL {
    private int data;
    private Node leftnext;
    private  Node rightnext;


    //constructors

    public Node(){
        this.data=0;
        this.leftnext=null;
        this.rightnext=null;
    }

    


    //getters and setters method
    public Node get_leftnext()
    {
        return this.leftnext;
    }


    public int get_data()
    {
        return this.data;
    }
    public void set_data(int val)
    {
        this.data=val;
    }

    // Node methods
    public void push(int value)
    {
       

        //when the dll size is 0
        if(super.get_Size()==0)
        {
            this.data=value;
            super.set_Head(this);
            super.set_Tail(this);

            //Head=this;//now head pointing to 1st node
            //Tail=this;//now Tail pointing to 1st node
            



            //leftnext and rightnext is null
            
            
            
        }
        //when the dll size is more than 0
        if(super.get_Size()>0)
        {
            this.data=value;
            Tail.leftnext=this;
           
            this.rightnext=Head;
            this.leftnext=null;
            Tail=this;







        }
        super.set_size();
    }

    public void NodeInsertionLocation1(Node newnode)
    {
        
        newnode.leftnext=DLL.Head;
        DLL.Head.rightnext=newnode;
        DLL.Head=newnode;


    }
    public void NodeInsertionLocationAtEnd(Node newnode)
    {
        newnode.rightnext=DLL.Tail;
        DLL.Tail.leftnext=newnode;
        DLL.Tail=newnode;

    }
    public void NodeInsertionLocationAtPosition(Node newnode,int loc)
    {
        Node travpointer=DLL.Head;
        for(int i=1;i<loc-1;i++)
        {
            travpointer=travpointer.leftnext;

        }
        newnode.leftnext=travpointer.leftnext;
        travpointer.leftnext.rightnext=newnode;
        travpointer.leftnext=newnode;
        newnode.rightnext=travpointer;
    }
    

    
    
}
