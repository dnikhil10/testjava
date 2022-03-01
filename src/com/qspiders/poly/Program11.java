package com.qspiders.poly;
class Nse
{
	void trading()
	{
		System.out.println("Start trading of stocks...");
	}
}
class Zerodha extends Nse
{
	void trading()
	{
		System.out.println("Start trading of stocks using zerodha...");
	}
}
class Upstocks extends Nse
{
	void trading()
	{
	System.out.println("Start trading of stocks using upstocks....");
	}
}
class Trader
{
	void BuyStocks(Nse ref)
	{
		ref.trading();
	}
}
public class Program11 
{public static void main(String[] args) 
{
	Trader t1=new Trader();
	t1.BuyStocks(new Zerodha());
	t1.BuyStocks(new Upstocks());
}
}
