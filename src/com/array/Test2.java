package com.array;
class Version1
{
	void chat()
	{
		System.out.println("open and text");
	}
}
class Version2 extends Version1
{
	void call()
	{
		System.out.println("open and call");
	}
}
class Version3 extends Version2
{
	void status()
	{
		System.out.println("put status");
	}
}
public class Test2 
{

	public static void main(String[] args) 
	{
       Version3 v3=new Version3();
       Version1 v1=v3;
       v1.chat();
       
       Version2 v2=(Version2)v1;
       v2.call();
       v2.chat();
       
       Version3 v4=(Version3)v1;
       v4.call();
       v4.chat();
       v4.status();
       
       

	}

}
