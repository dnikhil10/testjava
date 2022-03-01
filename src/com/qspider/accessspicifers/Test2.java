package com.qspider.accessspicifers;
class Demo1
{
	char gunda='M';
	void fight()
	{
		System.out.println("Fighting started in ring");
	}
}
class Demo2 extends Demo1
{
	char gundi='F';
	void fight1()
	{
		System.out.println("Fight between gunda and gundi");
	}
}
class Demo3 extends Demo2
{
	char umpire='H';
	void fight2()
	{
		System.out.println("Gunda won the fight");
	}
}
public class Test2 
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo3();//up casting
		System.out.println(d1.gunda);
		d1.fight();
		
		Demo2 d2 = (Demo2)d1;//Down casting
		System.out.println(d2.gunda);
		d2.fight();
		System.out.println(d2.gundi);
		d2.fight1();
		
		Demo3 d3=(Demo3)d2;//Down casting
		d3.fight2();
		System.out.println(d3.umpire);
		
		Demo1 r1=new Demo3();
		if (r1 instanceof Demo3)
		{
			Demo3 r3=(Demo3)r1;
			System.out.println("Down Casting is successful");
		}
		else
		{
			System.out.println("properties missing");
		}

	}

}
