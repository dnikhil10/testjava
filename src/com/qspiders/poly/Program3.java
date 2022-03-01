package com.qspiders.poly;
class MyntraAccount
{
	String userName="java";
	String password="java@123";
	void purchase()
	{
		System.out.println("purchase through your account");
	}
}
class MyntraInsider extends MyntraAccount
{
	void earlyAccess()
	{
		System.out.println("Get early access to sales");
	}
	void superCoins()
	{
		System.out.println("get super coins on shopping");
	}
}
class Shopping
{
	void shop(MyntraAccount ref)
	{
		System.out.println("username="+ref.userName);
		System.out.println("password="+ref.password);
		ref.purchase();
	}
}
public class Program3 
{  public static void main(String[] args) 
{
	Shopping s1=new Shopping();
	s1.shop(new MyntraAccount());
	s1.shop(new MyntraInsider());//upcasting
	
}

}
