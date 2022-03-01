package com.qspiders.Libraries;
import java.io.File;
import java.io.IOException;

public class Program3 
{public static void main(String[] args) 
{
	File ref=new File("C:/Stocks/p1.txt");
	try 
	{
		boolean res=ref.createNewFile();
		System.out.println(res);
	}
	catch (IOException e )
	{
		e.printStackTrace();
	}
	
}
}
