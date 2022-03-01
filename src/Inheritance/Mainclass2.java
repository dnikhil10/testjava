package Inheritance;
class High
{
	void drink(String name)
	{
		System.out.println("its wrogn");
	}
	void drink(int bottles)
	{
		System.out.println("its prohibited");
	}
	void drink (boolean drunk)
	{
		if (drunk==true)
		{
			System.out.println("bad");
		}
		else
		{
			System.out.println("good");
		}
	}
	High(String type)
	{
		System.out.println("Drinks");
	}
}
public class Mainclass2 {

	public static void main(String[] args)
	{
	  High h1=new High("Drink");
	  h1.drink(false);
	  
	}

}
