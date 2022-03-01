package com.qspiders.method;
class Qspider
{
	static String cousrse="Testing";
	static int fees=35000;
	static boolean skill()
	{
		boolean regular=true;
		boolean practice=true;
		if (regular==true && practice==true)
		{
		System.out.println("Learn testing skills");
		return true;
		}
		else
		{
			System.out.println("Better luck next time");
			return false;
		}
	}
}
public class Program14 
{
	public static void main(String[] args) 
{
	System.out.println("welcome to Qspiders");
	System.out.println("Course="+Qspider.cousrse);
	System.out.println("Fees="+Qspider.fees);
	boolean useful=Qspider.skill();
	System.out.println("Useful="+useful);
}

}
