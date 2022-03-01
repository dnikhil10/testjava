package com.qspiders.Libraries;
import java.util.Scanner;
public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("scanner class");
		Scanner ref=new Scanner(System.in);
		System.out.println("enter int value");
		int num=ref.nextInt();
		System.out.println("int num="+num);
		System.out.println("enter double value");
		double num2=ref.nextDouble();
		System.out.println("double num="+num2);
		System.out.println("enter string value");
		String name=ref.next();
		System.out.println("name="+name);
		//System.out.println("enter line value");
		//String lineName=ref.nextLine();
		//System.out.println("linename="+lineName);
	}

}
