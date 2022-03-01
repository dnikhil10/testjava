package com.qspiders.abstraction;
interface Estore
{
	void selectproduct();
	void buyproduct();
	void rateproduct();
}
class Flipkart implements Estore
{
	String customername;
	long mobileno;
	Flipkart(String customername,long mobileno)
	{
		this.customername=customername;
		this.mobileno=mobileno;
	}
	public void selectproduct()
	{
		System.out.println("select product in flipkart..");
	}
	public void buyproduct()
	{
		System.out.println("Buy the selected product in flipkart");
	}
	public void rateproduct()
	{
		System.out.println("Rate product as per its quality in flipkart");
	}
}
class Myntra implements Estore
{
	String customername;
	long mobileno;
	Myntra(String customername,long mobileno)
	{
		this.customername=customername;
		this.mobileno=mobileno;
	}
	public void selectproduct()
	{
		System.out.println("select product in Myntra..");
	}
	public void buyproduct()
	{
		System.out.println("Buy the selected product in Myntra");
	}
	public void rateproduct()
	{
		System.out.println("Rate product as per its quality in Myntra");
	}
}
class Playstore
{
	Estore download(char name)
	{
		if (name=='F')
		{
			return new Flipkart("java",77603993201l);
		}
		else
		{
			return new Myntra("jdk",8971078404l);
		}
	}
}
public class Program2 
{public static void main(String[] args) 
{
	Playstore p1=new Playstore();
	Estore e1=p1.download('F');
	e1.selectproduct();
	e1.buyproduct();
	e1.rateproduct();
}
}
