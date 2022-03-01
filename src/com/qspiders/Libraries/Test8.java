package com.qspiders.Libraries;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args)
	{
	 System.out.println("main method started");
	 try
	 {
     Scanner s=new Scanner(System.in);
     System.out.println("enter int1 value");
     int n1 = s.nextInt();
     System.out.println(n1);
     System.out.println("enter int2 value");
     int n2=s.nextInt();
     System.out.println(n2);
     int n3=n1/n2;
     System.out.println(n3);
	 }
	 catch (InputMismatchException ref)
	 {
		 System.out.println("input mismatch exception handled");
	 }
	 catch (ArithmeticException ref)
	 {
		 System.out.println("airthmetic exception handled");
	 }
	 catch (Exception ref)
	 {
		 System.out.println("exception handled");
	 }
	 System.out.println("main method ended");
     
	}

}
