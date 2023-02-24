package staticvar;

public class main2 {




    public void nonstaticmethod(){
        System.out.println("calling from static main to nonstatic");
    }
    public static void main(String[] args)
    {
        bank bankuser1=new bank("UTKARSH","PASS@123",10002310,111);
        System.out.println(bank.rateofinterest);//static vaiables can be directly accessed by class
        System.out.println(bank.roi());
        //nonstaticmethod();


    }
    
}
