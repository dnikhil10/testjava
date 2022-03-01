package com.qspiders.Libraries;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program2 
{
	public static void main(String[] args) 
{  
	try
	{
     Scanner ref=new Scanner(System.in);
     int num1=ref.nextInt();
     System.out.println(num1);
     int num2=ref.nextInt();
     System.out.println(num2);
     double res;
     res=num1/num2;
     System.out.println(res);
	}
	catch(ArithmeticExecption ref )
	{
		System.out.println("Airthmetic exception handled");
	}
	catch(Exception ref)
	{
		System.out.println("Generic Exception");
	}
}

}
