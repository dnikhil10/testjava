package com.nikhil.practice;

import java.io.FileWriter;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) throws IOException {
	FileWriter f1=new FileWriter("C:\\java\\Corejava\\test.txt");
	f1.write("hii and hello java");
	f1.flush();
	System.out.println("data written");

	}

}
