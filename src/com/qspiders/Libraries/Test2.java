package com.qspiders.Libraries;
class CurrencyNote
{
	int serial;
	int cost;
	String colour;
	public CurrencyNote(int serial,int cost,String colour)
	{
		this.serial=serial;
		this.cost=cost;
		this.colour=colour;
	}
	public boolean equals(Object ob)
	{
		CurrencyNote ctn=(CurrencyNote)ob;
		return this.serial==ctn.serial;
	}
}
public class Test2 {

	public static void main(String[] args) {
		CurrencyNote c1=new CurrencyNote(12345,500,"grey");
		CurrencyNote c2=new CurrencyNote(12345,2000,"pink");
		System.out.println(c1==c2);
		boolean ans = c1.equals(c2);
		System.out.println(ans);
	}

}
