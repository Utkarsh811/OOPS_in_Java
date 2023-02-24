package OOPeg1;
public class main1{


    public static void main(String[] args)
    {
        //Student s1=new Student(); // default constructor nonparamaterised
        Student s1= new Student(); // non argumentt constructor
        Student s2=new Student("UTKARSH");
        System.out.println(s1.contactno +","+ s1.Name);
        Student s4=new Student();
        Student s3=new Student(s4);

        
    }
}