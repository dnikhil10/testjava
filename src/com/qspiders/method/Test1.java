package com.qspiders.method;

public class Test1 
{
	static int z=20;
	static void add()
	{
	   char gen='m';
	   int res1=++gen;
	   System.out.println(res1);
	}
   public static void main(String[] args) 
	{ 
		byte c=127;
	    byte res=++c;
	    System.out.println(res);
	    add();
	    System.out.println(z);
	    System.out.println(!true);
	    System.out.println(!false);
	    run();
	    fly();
	 }
   static void run()
   {
	   String gra="pass";
	   String gra1="fail";
	   if (gra=="pass"&& gra1=="pass")
	   {
		   System.out.println("Student is passed");
	   }
	   else
	   {
		   System.out.println("Student is failed");
	   }
   }
   static void fly()
   {
	   int a=20;
	   int b=15;
	   int c=40;
	   boolean res = a<b || a++<b++ || ++c>a;
       System.out.println(res);
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
	}
}
