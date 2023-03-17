package Generics;

public class cod1 <whatever_type_you_want> {


    private  whatever_type_you_want value;

    public cod1(whatever_type_you_want val)
    {
        this.value=val;
        
        

    }
    public void printvalue()
    {
        System.out.println(this.value);
    }
    public static void main(String[] args)
    {
        cod1 <Integer> objct=new cod1<>(23);
        objct.printvalue();
        cod1 <Double>  anct=new cod1<>(34.45);

        anct.printvalue();

        

    }
    
}
