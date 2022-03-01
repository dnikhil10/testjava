package practice;
class Shop
{
	public String toString()
	{
		return "hii world";
	}
}
class Hotel
{
	public int hashCode()
	{
		return 50;
	}
	public boolean equals(Object ob)
	{
		return true;
	}
}
public class Test7 {
   public static void main(String[] args) {
	Shop s=new Shop();
	System.out.println(s);
	int value = s.hashCode();
	System.out.println(value);
	
	Hotel h=new Hotel();
	System.out.println(h.toString());
	System.out.println(h.hashCode());
	System.out.println(h.equals(s));

	}

}
