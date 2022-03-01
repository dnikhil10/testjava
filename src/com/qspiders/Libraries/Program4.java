package com.qspiders.Libraries;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
	
	System.out.println("Scanner class");
	Scanner s=new Scanner(System.in);
	System.out.println(s);
	System.out.println("integer value");
	int ref = s.nextInt();
	System.out.println("num="+ref);
	System.out.println("Double value");
	double ref1 = s.nextDouble();
	System.out.println("double value="+ref);
	String ref2 = s.next();
	System.out.println("String="+ref2);
	int ref3 = s.hashCode();
	System.out.println(ref3);
	}

}
