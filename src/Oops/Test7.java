package Oops;
class Sample4
{
	double b=7.89;
	void test()
	{
		System.out.println("test method");
		double b=25.56;
		System.out.println(b);
		System.out.println(this.b);
	}
}
class Ref1
{
	int a=67;
	Ref1()
	{
		int a=5;
		System.out.println(a);
		System.out.println(this.a);
	}
}
public class Test7 
{
public static void main(String[] args)
{
	Sample4 s1=new Sample4();
	s1.test();
	Ref1 r1=new Ref1();

	}

}
