package Oops;
class NewsPaper
{
	String name;
	int cost;
	int noOfPages;
	NewsPaper(String name,int cost,int noOfPages)
	{
		this.name=name;
		this.cost=cost;
		this.noOfPages=noOfPages;
	}
	static String read()
	{
		System.out.println("gain knowleadge");
		return "Knowledge";
	}
}
public class Test5 {

	public static void main(String[] args) 
	{ 
		NewsPaper n1=new NewsPaper("Toi",500,300);
		System.out.println(n1.name);
		System.out.println(n1.cost);
		System.out.println(n1.noOfPages);
		NewsPaper n2=new NewsPaper("Indian Express",600,700);
		System.out.println(n2.name);
		System.out.println(n2.cost);
		String mess=NewsPaper.read();
		System.out.println(mess);
		

	}

}
