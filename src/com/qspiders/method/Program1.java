package com.qspiders.method;

public class Program1 
{
	int a;
	char sim;
	static void start(int a,char sim)
	{
		System.out.println("start method....");
		System.out.println(a);
		System.out.println(sim);
	}
public static void main(String[] args)
{
	System.out.println("hello world");
	Program1 ref=new Program1();
	//ref.start(450,'f');
	start(789,'m');
	end();
	start(723,'g');
	end();
	System.out.println("hiii....");
}
static void end()
{
	System.out.println("end method...");
}
}
