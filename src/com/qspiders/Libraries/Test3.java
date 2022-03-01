package com.qspiders.Libraries;
class Demo3
{
	int a=45;
}
public class Test3 {

	public static void main(String[] args)
	{
	  Demo3 d3=new Demo3();
	  System.out.println("d3="+d3.a);
	  d3.a=85;
	  System.out.println("d3="+d3.a);
	  d3.a=100;
	  System.out.println(d3.a);
	  
	  String s1="hiii";
	  System.out.println("s1="+s1);
	  String s2=s1;
	  System.out.println(s2);
	  
	  s1="java";
	  System.out.println("s1="+s1);
	  System.out.println("s2="+s2);
	  
	  String s3="w";
	   s3="world";
	  System.out.println(s3);
	  System.out.println(s3.hashCode());
	}

}
