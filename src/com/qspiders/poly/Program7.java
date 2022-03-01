package com.qspiders.poly;
class Demo1
{
	int a=10;
	void task()
	{
		System.out.println("start task...");
	}
}
class Demo2 extends Demo1
{
	double b=32.345;
	void end()
	{
		System.out.println("start end method...");
	}
}
public class Program7 
{
	public static void main(String[] args) 
{
	Demo1 d2=new Demo2();//upcasting
	System.out.println(d2.a);
	d2.task();
	Demo2 ref=(Demo2)d2;
	System.out.println(ref.b);
	ref.end();
	
	
}

}
