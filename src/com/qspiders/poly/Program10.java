package com.qspiders.poly;
class TrainingInstitutes
{
	void corejava()
	{
		System.out.println("Get core java training..");
	}
}
class Qspiders extends TrainingInstitutes
{
	void corejava()
	{
		System.out.println("Get best in class training by live classes");
	}
}
class Udemy extends TrainingInstitutes
{
	void corejava()
	{
		System.out.println("Get training by recorded classes");
	}
}
class Learner
{
	void learnjava(TrainingInstitutes ref)
	{
		ref.corejava();
	}
}
public class Program10 
{public static void main(String[] args) 
{
	Learner s1=new Learner();
	s1.learnjava(new Qspiders());
	s1.learnjava(new Udemy());
}

}
