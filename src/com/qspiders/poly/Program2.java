package com.qspiders.poly;
class Student1
{
	void coreJava()
	{
		System.out.println("learn core java");
	}
}
class Student2 extends Student1
{
	void selenium()
	{
		System.out.println("learn selenium");
	}
}
class Company
{
	void interview(Student2 ref)
	{
		ref.coreJava();
		ref.selenium();
	}
}
public class Program2 
{
	public static void main(String[] args) 
	{
		Company c1=new Company();
		c1.interview(new Student2());
		c1.interview(new Student2());//upcasting 
	
}
	

}
