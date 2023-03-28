package References;

public class prog2 {
    //showing referencing
    String Name;
    double marks;
    String id;
    String Location;
    String status;

    //constructor
    public prog2()
    {

    }
    public prog2(String Name, double marks,String id,String Location, String status)
    {
        this.Name=Name;
        this.marks=marks;
        this.id=id;
        this.Location=Location;
        this.status=status;
    }

    public static void main(String[] args)
    {
        prog2 object1=new prog2("Utkarsh",23.45,"id1","Mumbai","Outstanding"); //initializing a reference variable
        prog2 object2=null; //declaring a reference variable

        //assigning
        object2=object1;
        System.out.println(object1);
        System.out.println(object2);


        //changing object2
        object2.Name="Mridul";
        System.out.println(object1.Name);



        //testing
        prog2 obj=null;
        prog2 obj1=null;

        obj=new prog2("billu",67.89,"id2","mum","better");
        obj1=obj;
        System.out.println(obj1.Name);
    



    }
    

    
}
