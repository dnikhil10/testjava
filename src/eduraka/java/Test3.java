package eduraka.java;
class Pg
{
	static void stay()
	{
		System.out.println("stay in pg...");
	}
}
class Home extends Pg
{
	static void stay()
	{
		System.out.println("stay in home....");
	}
}
public class Test3 {
	
	static char male='m';
	public static void main(String[] args) 
	{
	  final int a=76;
	  System.out.println(a);
	  System.out.println("original main method...= "+male);
	  System.out.println(a);
	  Pg p1=new Pg();
	  p1.stay();
	  p1=new Home();
	  p1.stay();
	  Home.stay();

	}

}
