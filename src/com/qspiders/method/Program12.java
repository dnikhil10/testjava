package com.qspiders.method;

public class Program12 
{ 
	public static int cardPayment(long cardno,String name,double cvv)
	{
		if (name=="nikhil")
		{
			System.out.println("welcome nikhil");
			System.out.println(cardno);
			System.out.println(name);
			System.out.println(cvv);
			return 89723;
		}
		else if (name=="java")
		{
			System.out.println("welcome java");
			System.out.println(cardno);
			System.out.println(name);
			System.out.println(cvv);
		    return 67534;
		}
		else
		{
			System.out.println("Enter proper details");
			return 0000;
		}
	}
public static void main(String[] args) 
{
	//byte a=100;
	int otp=cardPayment(456712343434l,"java",32.45);
	System.out.println(otp);
	//byte b=123;
	int otp2=cardPayment(456712343434l,"nikhil",22.5);
	System.out.println("otp="+otp2);
	int otp3=cardPayment(456712343434l,"hello",22.5);
	System.out.println("otp="+otp3);
}
}
