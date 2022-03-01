package com.qspiders.abstraction;
abstract class Coke
{
	abstract void receipe();
	void contents()
	{
		System.out.println("Done by carbohydrates");
	}
}
class CokeInsider extends Coke
{
	void receipe()
	{
		System.out.println("Receipe is hidden");
	}
}
public class Test0 {

	public static void main(String[] args) 
	{
       CokeInsider c1=new  CokeInsider();
       c1.contents();
       c1.receipe();

	}

}
