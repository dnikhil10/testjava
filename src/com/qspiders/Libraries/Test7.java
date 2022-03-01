package com.qspiders.Libraries;

public class Test7
{
	public static void add() 
	{
		System.out.println("adding");
	}

	public static void main(String[] args) 
	{
		try 
		{
		int i=1/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("handled");
		}
		
		System.out.println("hello java");
		Test7.add();

	

	}

}
