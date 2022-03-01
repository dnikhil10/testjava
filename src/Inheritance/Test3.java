package Inheritance;
class Sam1
{
	int a=25;
}
class Sam2 extends Sam1
{
	int a=52;
	void walk()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}
public class Test3 {

	public static void main(String[] args) 
	{
	       Sam2 ref=new Sam2();
	       System.out.println(ref.a);
	       ref.walk();
	}
}
