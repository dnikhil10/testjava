package com.nikhil.practice;

import java.io.FileReader;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) {
	try
	{
		FileReader fr=new FileReader("C:\\\\java\\\\Corejava\\\\test.txt");
		int res1 = fr.read();
		while(res1!=-1) {
			System.out.println((char)res1);
			res1=fr.read();
			
		}
		
	}
	catch (IOException e1)
	{
		e1.printStackTrace();
	}
	catch (ArithmeticException a1)
	{
		a1.printStackTrace();
	}

	}

}
