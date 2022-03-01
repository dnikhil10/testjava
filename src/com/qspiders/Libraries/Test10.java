package com.qspiders.Libraries;
class Student
{
   void learn()
   {
	   System.out.println("learn java");
	   int a=1/0;
	   System.out.println(a);
   }
}
class Trainer
{
	void pickStudent()
	{
		System.out.println("pick student for interview");
		Student st=new Student();
		st.learn();
	}
}
class Hr
{
	void interview()
	{
		System.out.println("Assign interview");
		Trainer tr=new Trainer();
		tr.pickStudent();
		
	}
}
public class Test10 {

	public static void main(String[] args) {
	System.out.println("Institute ");
	try
	{
		Hr h1=new Hr();
		h1.interview();
	}
	catch (ArithmeticException ref)
		{
			System.out.println("exception handled");
		}
	finally
	{
		System.out.println("always work hard");
	}

	}

}
