package com.qspiders.abstraction;
interface job
{
	int noOfPositions=20;
	void aptipaper();
	void interviewQuestion();
}
class Company implements job
{
	public void aptipaper()
	{
		System.out.println("answer all question");
	}
	public void interviewQuestion()
	{
		
	}
}
public class Test2 {
    public static void main(String[] args) {
	
	}

}
