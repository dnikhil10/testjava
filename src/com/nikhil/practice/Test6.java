package com.nikhil.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PanCard implements Serializable
{
	String name;
	int no;
	int age;
	
	public PanCard(String name,int no,int age)
	{
		this.name=name;
		this.no=no;
		this.age=age;
	}
	public String toString()
	{
		return "Pancard [name=" + name + ", no=" + no + ", age=" + age + "]";
	}
	
	
}
public class Test6 {

	public static void main(String[] args) throws IOException {
	PanCard pa=new PanCard("Modi",675,70);
	try
	{
	FileOutputStream fo=new FileOutputStream("C:\\java\\test1.txt");
    ObjectOutputStream op=new ObjectOutputStream(fo);
    op.writeObject(pa);
    System.out.println("object written");
	}
	catch(FileNotFoundException f1)
	{
		f1.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
    
	}


}
