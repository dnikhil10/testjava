package com.qspiders.method;

import java.util.Scanner;

public class Test2 
{
	static int forgotpassword(long mobileno)
	{
		return 897100;
	}
    public static void main(String[] args) 
	{
	 	String appName="facebook";
	 	Scanner s=new Scanner(System.in);
	 	login("Nikhilndme","nikhil*2021");
	 	System.out.println(appName);
	 	
    }
    static void login(String username,String password) 
    {
    	
    	if (username=="Nikhilndme" && password=="nikhil*2021")
    	{
    	  System.out.println(username);
    	  
    	  System.out.println("welcome to fb");
    	}
    	else
    	{
    		int otp=forgotpassword(8971008303l);
    		System.out.println(otp);
    	}
    }

}
