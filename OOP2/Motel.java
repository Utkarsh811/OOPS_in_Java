package OOP2;

public class Motel {
    private int motelId;
    private String motelName;
    private String dateofBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;
   
    /**  motelId - int
motelName - String
dateOfBooking – String (in the format dd-mon-yyyy)
noOfRoomsBooked – int
cabFacility – String
totalBill- double */




    //constructor
    public Motel()
    {

    
    }
    public Motel(int mi,String mn,String db,int nr,String cb,double tb)
    {
        this.motelId=mi;
        this.motelName=mn;
        this.dateofBooking=db;
        this.noOfRoomsBooked=nr;
        this.cabFacility=cb;
        this.totalBill=tb;
        

    }

    //getters and setters method

    public static int getmotelId(Motel traverse)
    {
        return traverse.motelId;

    }
    public static String getmotelName(Motel traverse)
    {
        return traverse.motelName;

    }
    public static int getnoOfRoomsBooked(Motel traverse)
    {
        return traverse.noOfRoomsBooked;

    }
    public static String getcabFacility(Motel traverse)
    {
        return traverse.cabFacility;

        

    }
    public static void getattributes()
    {

    }
    public static void getattributes()
    {

    }

    public static void setattributes()
    {

    }
     
    
}
