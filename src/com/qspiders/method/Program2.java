package com.qspiders.method;

public class Program2 
{
	static void demo1()
	{
		System.out.println("start demo...");
	}
	static byte otp(long mobileno,String name)
	{
		System.out.println("Mobile No="+mobileno);
		System.out.println("User name="+name);
		return 45;
	}
	public static void main(String[] args) 
	{
		demo1();
		byte a=otp(8971008303l,"Nikhil");
		System.out.println("password="+a);
	}
	

}
