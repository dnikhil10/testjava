package Oops;
class Apartment
{
	static String apartmentName="Pebble Bay";
	int electricityBill=2000;
	byte houseNo=56;
	String housecolour="white";
	static void stay()
	{
		System.out.println("Live in the house");
	}
	void getTogether()
	{
		System.out.println("Party in one apartment");
	}
}
class Facebook
{
	static String appName="facebook";
	static String appcolour="Blue";
	String login(String userName,long mobileno)
	{
		System.out.println("UserName="+userName);
		System.out.println("Password="+mobileno);
		return "welcome to Facebook";
	}
	boolean acceptRequest(String friendName)
	{
		System.out.println(friendName);
		return true;
	}
}
public class Test1
{
   public static void main(String[] args) 
   {
	   Apartment ap=new Apartment();
	   System.out.println(Apartment.apartmentName);
	   System.out.println(ap.electricityBill);
	   System.out.println(ap.housecolour);
	   System.out.println(ap.houseNo);
	   Apartment.stay();
	   ap.getTogether();
	   Facebook fb=new Facebook();
	   System.out.println(Facebook.appcolour);
	   System.out.println(Facebook.appName);
	   String Display=fb.login("Meta", 8761008303l);
	   System.out.println(Display);
	   boolean done=fb.acceptRequest("java");
	   System.out.println(done);
	   }

}
