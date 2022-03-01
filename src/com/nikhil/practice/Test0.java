package com.nikhil.practice;

public class Test0 {
	
	private static int vaccine(long adharno,long mobileno,String name)
	{
		System.out.println("vaccine details");
		System.out.println(adharno);
		System.out.println(mobileno);
		System.out.println(name);
		return 897100;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		int otp=vaccine(123467893456l,8971008303l,"nik");
		System.out.println(otp);
		
		int otp1=vaccine(345678901234l,7760323401l,"kkk");
		System.out.println(otp1);	
		
		if (otp==897100)
		{
			System.out.println("hiii");
		}
		else
		{
			System.out.println("hello");
		}
	}

}
