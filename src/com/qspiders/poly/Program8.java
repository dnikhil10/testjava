package com.qspiders.poly;
class Father
{
	int a=99;
	void house()
	{
		System.out.println("old house..");
	}
}
class Son extends Father
{
	int b=90;
	void house()
	{
		System.out.println("renovated new house...");
	}
}
public class Program8 
{ public static void main(String[] args) 
{
	Father ref =new Son();//up casting 
	ref.house();// when method overriding is done it implements sub class object
	System.out.println(ref.a);
}

}
