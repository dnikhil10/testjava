package eduraka.java;
class Phone
{
	Phone(int cost,String brand)
	{
		this();
		System.out.println("hii and hello");
	}
	Phone()
	{
		System.out.println("phone.....");
	}
	static void call()
	{
		System.out.println("calling.....");
	}
	static void text()
	{
		System.out.println("texting.....");
	}
}
class Android extends Phone
{
	Android()
	{
		super(8976,"hello");
		System.out.println("hhhhh..");
	}
}

public class Test2 {

	public static void main(String[] args) 
	{
	  Android a=new Android();
	  a.text();
	  a.call();

	}

}
