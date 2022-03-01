package com.array;
class Receive
{
	void get()
	{
		System.out.println("receive message");
	}
}

class Give extends Receive
{
	void got()
	{
		System.out.println("got the message");
		
	}
}
public class Test1
{
   public Test1(Give r)
   {
	   System.out.println("test ur program skills");
	   r.get();
	   r.got();
   }
   void send (Object ob)
   {
	   System.out.println("send text");
   }
	public static void main(String[] args) 
	{
	   Test1 t=new Test1(new Give());
	   t.send(new Object());
	   t.send(t);

	}

}
