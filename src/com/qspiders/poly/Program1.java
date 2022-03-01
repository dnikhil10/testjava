package com.qspiders.poly;

class Pen
{
	String name="cello";
	void spillink()
	{
		System.out.println("spill ink");
	}
}
class Student
{
	void write(Pen ref)
	{
		System.out.println("Pen name="+ref.name);
		ref.spillink();
	}
}
public class Program1 
{
public static void main(String[] args) 
{
	Student s1=new Student();
	s1.write(new Pen());
	
}

}
