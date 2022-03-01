package practice;
class Travel
{
	static String appName="MMT";
	static String colour="orange";
	String from;
	String to;
	int noOfPassengers;
	String airLineName;
	
	String signup(String username,String password,long mobileno)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(mobileno);
		return "account created successfully";
	}
	Travel(String from,String to,int noOfPassengers)
	{
		this.from=from;
		this.to=to;
		this.noOfPassengers=noOfPassengers;
	}
	Travel()
	{
		this("KGIP","NYC",5);
		airLineName="Kingfisher";
	}
}
public class Test0
{
	
	public static void main(String[] args)
	{
		int[] myNum = {10, 20, 30, 40};
		for(int i=0;i<myNum.length;i++)
		{
			System.out.println(myNum[i]);
		}
		
		for(int num:myNum)
		{
			System.out.print(num+" ");
		}

		

	    Travel tr=new Travel();
	    System.out.println(tr.appName);
	    System.out.println(tr.colour);
	    System.out.println(tr.airLineName);
	    System.out.println(tr.from);
	    System.out.println(tr.to);
	    System.out.println(tr.noOfPassengers);
	    String ref = tr.signup("Nikhil","hihihi",8971008303l);
	    String ref1=tr.signup("java","gunda",8877665544l);
	}

}
