package com.qspiders.Libraries;
class Sample1
{
	
}
class Sample2
{
	public int hashCode()
	{
		return 15;
	}
}
public class Test0 {

	public static void main(String[] args) 
	{
	  Sample1 s1=new Sample1();
	  System.out.println(s1.hashCode());
	  
	  Sample2 s2=new Sample2();
	  System.out.println(s2.hashCode());
	}

}
