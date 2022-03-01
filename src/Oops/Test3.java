package Oops;

class Sample1
{
	int a;
	String mess;
	Sample1()
	{
		System.out.println("Executing sample1 constructor");
		a=30;
		mess="Hii";
	}
}

public class Test3 {

	public static void main(String[] args) 
	{
	    Sample1 s1=new Sample1();
	    System.out.println(s1.a);
	    System.out.println(s1.mess);
        new Sample1();
        new Sample1();
        
	}

}
