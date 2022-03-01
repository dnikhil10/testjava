package Inheritance;
class Demo1
{
	int a=28;
	int run()
	{
		System.out.println("Start running");
		return 550;
	}
	Demo1(String message,int cost)
	{
		System.out.println(message);
		System.out.println("cost="+cost);
		System.out.println("Start demo1 constructor");
	}
}
class Demo2 extends Demo1
{
	Demo2()
	{
		super("Hii",5000);
		System.out.println("Start demo2 constructor");
	}
	Demo2(double percentage,boolean car)
	{
		this();
		System.out.println(percentage);
		System.out.println(car);
	}
}

public class Test2 {

	public static void main(String[] args)
	{
		Demo2 d2=new Demo2(432.675,true);
		d2.run();
		System.out.println(d2.a);
		
	}

}
