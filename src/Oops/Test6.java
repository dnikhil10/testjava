package Oops;
class Demo
{ int a=50;
Demo()
{
	System.out.println("Demo1 constructor");
	System.out.println(this.a);
}
	
}

public class Test6 {

	public static void main(String[] args) 
	{
	   Demo d1=new Demo();
	   System.out.println(d1);
	}

}
