package com.qspiders.abstraction;
interface FoodDeliveryApp
{
	void selectitem();
	void buyitem(int bill);
	void rateorder();
}
class Swiggya implements FoodDeliveryApp
{
	String customername;
	long mobileno;
	Swiggya(String customername,long mobileno)
	{
		this.customername=customername;
		this.mobileno=mobileno;
	}
	public void selectitem()
	{
		System.out.println("select product in swiggya..");
		System.out.println("It will connect to selected restaurant");
		System.out.println("It will make sure item is available or not");
	}
	public void buyitem(int bill)
	{
		System.out.println("Buy the item from selected restaurant..");
		System.out.println("It will take to payment page");
		System.out.println("on successful payment,order will be confirmed by restaurant");
		System.out.println("App will assign deliver person and deliver the product ");
		System.out.println("Bill amount="+bill);
	}
	public void rateorder()
	{
		System.out.println("Rate product as per its quality");
		System.out.println("Salary of the delivery person depends on ratings");
        System.out.println("Restaurant ratings also depends on customer ratings");	
	}
	
}
class Zomato implements FoodDeliveryApp
{
	String customername;
	long mobileno;
	Zomato(String customername,long mobileno)
	{
		this.customername=customername;
		this.mobileno=mobileno;
	}
	public void selectitem()
	{
		System.out.println("select product in Zomato..");
		System.out.println("It will connect to selected restaurant");
		System.out.println("It will make sure item is available or not");
	}
	public void buyitem(int bill)
	{
		System.out.println("Buy the item from selected restaurant..");
		System.out.println("It will take to payment page");
		System.out.println("on successful payment,order will be confirmed by restaurant");
		System.out.println("App will assign deliver person and deliver the product ");
		System.out.println("Bill amount="+bill);
	}
	public void rateorder()
	{
		System.out.println("Rate product as per its quality");
		System.out.println("Salary of the delivery person depends on ratings");
	}
}
class Istore
{
	FoodDeliveryApp download(char name)
	{
		if (name=='z')
		{
			return new Zomato("java",7760343201l);
		}
		else
		{
			return new Swiggya("jdk",8971078404l);
		}
	}
}
public class Program3 
{
	public static void main(String[] args) 
{
	Istore p1=new Istore();
	FoodDeliveryApp e1=p1.download('z');
	e1.selectitem();
	e1.buyitem(500);
	e1.rateorder();
}

}
