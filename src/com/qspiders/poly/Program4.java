package com.qspiders.poly;
class Gym
{
	void run()
	{
		System.out.println("run on treadmill");
	}
	void liftWeight()
	{
		System.out.println("Lift weight and tone muscles");
	}
}
class Teacher
{
	void teach()
	{
		System.out.println("Teach in the class");
	}
	void prepareNotes()
	{
		System.out.println("Prepare notes for students");
	}
}
class Home
{
	void stay(Object ob)
	{
		System.out.println("stay in the home..");
	}
}
public class Program4 
{public static void main(String[] args) 
{
	Home ref=new Home();
	ref.stay(new Object());
	ref.stay(new Gym());
	ref.stay(new Teacher());
	
	
	
}

}
