package eduraka.java;

public class Chair {
    static int noOfLegs=4;
    static String colour="White";
    
    static void sit(int person)
    {
    	System.out.println("sit in the chair");
    	stand();
    }
    static void stand()
	{
		System.out.println("stand in the chair");
	}
	public static void main(String[] args) 
	{
	  System.out.println(colour);
	  System.out.println(noOfLegs);
	  sit(2);
	  stand();
	}

}
