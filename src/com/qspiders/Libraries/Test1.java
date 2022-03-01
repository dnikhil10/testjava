package com.qspiders.Libraries;
class Run
{
	
}
class Walk
{
	public String toString()
	{
		return "hii java";
	}
}
public class Test1 {

	public static void main(String[] args) 
	{
	  Run r1=new Run();
	  System.out.println(r1.hashCode());
	  System.out.println(r1);
	  System.out.println(r1.toString());
	  
	  Walk w1=new Walk();
	  System.out.println(w1);
	  System.out.println(w1.toString());

	}

}
