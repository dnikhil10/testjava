package Oops;
class Flipkart
{
	static String ceo="agarwal";
	static int login(String email,long mobileno)
	{
		System.out.println("welcome to ekart");
		return 7756;
	}
}
public class Test0 
{
    static String appName="Myntra";
    static String appColour="pink";
    static String shop(String username,long mobileno)
    {
    	System.out.println("Shop for your favourite brands");
    	return "cloths";
    }
    public static void main(String[] args) 
	{
      System.out.println("App="+appName);
      System.out.println("Display="+appColour);
      String item=shop("java",9740218650l);
      System.out.println("item="+item);
      System.out.println("name="+Flipkart.ceo);
      int otp1=Flipkart.login("nikhi@123.com", 8971008303l);
      System.out.println(otp1);
      int otp2=Flipkart.login("hii@123.com", 7766554411l);
      System.out.println(otp2);
	}
}
