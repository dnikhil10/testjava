package Inheritance;

class FlipKart
{
	String username;
	long password;
	FlipKart(String username,long password)
	{
		this.username=username;
		this.password=password;
		System.out.println("hii ram");
	}
	void shop()
	{
		System.out.println("Do online shopping");
	}
}
class FlipKart1 extends FlipKart
{
	FlipKart1()
	{
		super("Java",8971008303l);
		System.out.println("hii hello");
	}
	void paylater()
	{
		System.out.println("Pay later option is added");
	}
}
class FlipKart2 extends FlipKart1
{
	FlipKart2(float discount)
	{
		System.out.println(discount);
		System.out.println("plus coins is added");
	}
	void swim()
	{
		System.out.println("swim in the sea");
	}
}
public class Mainclass1 
{
  public static void main(String[] args)
  {  FlipKart2 f1=new FlipKart2(67.8f);
     f1.swim();
     f1.paylater();
     f1.shop();
     System.out.println(f1.username);
     System.out.println(f1.password);


 }

}
