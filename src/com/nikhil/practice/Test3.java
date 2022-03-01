package com.nikhil.practice;

import java.io.File;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
	File f=new File("C:\\java\\Corejava\\test.txt");
	try
	{
		boolean res = f.createNewFile();
		System.out.println("file created="+res);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

	}

}
