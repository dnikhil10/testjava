package Inheritance;
class Java1
{
	 void first20days()
	{
		System.out.println("basics of java");
	}
}
class Java2 extends Java1
{
	 void next20days()
	{
		System.out.println("oops concept");
	}
}
class Java3 extends Java2
{
	String last20days()
	{
		System.out.println("Pre defined concept in java");
		return "Complete java Knowledge";
	}
}
public class Test1 {

	public static void main(String[] args) 
	{
		Java3 j3=new Java3();
		j3.first20days();
		j3.next20days();
		String k1=j3.last20days();
		System.out.println("Finally we get="+k1);

	}

}
