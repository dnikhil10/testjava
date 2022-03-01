package com.filehandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	
   
	public static void main(String[] args) {
		try
		   {
	Scanner s=new Scanner(System.in);
	int num1=s.nextInt();
	System.out.println(num1);
	int num2=s.nextInt();
	System.out.println(num2);
	int res=num1/num2;
	System.out.println(res);

	        }
	
	catch(InputMismatchException e1)
	{
		System.out.println("input mismatched");
	}
		catch (ArithmeticException r1)
		{
			System.out.println("arithmetic exception offered");
		}
	
	catch(Exception ref)
		{
		ref.printStackTrace();
		 System.out.println("exception occured");
		}
		finally
		{
			System.out.println("hiiii");
			System.out.println("hello");
		}

	}

}
