package OOPeg1;

public class Student {


    int contactno;
    String Name;
    int rollno;
    String course;


    //Constructor 
    public Student(){
        System.out.println("Hello I am a non argument constructor");

    }
    //PARAMATERISED CONSTRUCTOR
    public Student(String name)
    {
        
        System.out.println("My name is "+ name+" I am a parametrised constructor");
    }
    public Student(Student s4)
    {
        System.out.println(s4);
    }
    
}
