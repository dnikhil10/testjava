package com.qspiders.poly;
class Version1
{
	int a=10;
	void walk()
	{
		System.out.println("walking..");
	}
}
class Version2 extends Version1
{
	double b=45.56;
	void run()
	{
		System.out.println("start running...");
	}
}
class Version3 extends Version2
{
	float c=3.142f;
	void swim()
	{
		System.out.println("start swimming....");
	}
}
public class Program6 
{public static void main(String[] args) 
{
	Version1 ref=new Version3();
	System.out.println(ref.a);
	ref.walk();
	
	Version2 v2=(Version2)ref;
	System.out.println(v2.b);
	Version3 v3=(Version3)ref;
    System.out.println(v3.c);
	v3.swim();
	v2.run();
	Version1 v4=new Version3();
	if (v4 instanceof Version3)
	{
		Version3 ref2=(Version3)v4;
		ref2.swim();
		System.out.println("downcasting sucessful");
	}
	else
	{
		System.out.println("Properties missing");
	}
	}
}
