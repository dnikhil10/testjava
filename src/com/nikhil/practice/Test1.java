package com.nikhil.practice;

class Apartment
{
	static String name="PM";
	String houseName;
	int eleBill;
	int houseNo;
	
	Apartment(String houseName,int eleBill,int houseNo)
	{
        this.houseName=houseName;
		this.eleBill=eleBill;
		this.houseNo=houseNo;
		System.out.println(this);
	}
}
public class Test1 {

	public static void main(String[] args)
	{
	   Apartment ap=new Apartment("hii",45,66);
	   System.out.println(ap);
	   System.out.println(ap.toString());
	   System.out.println(ap.eleBill);
	   System.out.println(ap.houseName);
	   System.out.println(ap.houseNo);
	   
Apartment ap1=new Apartment("java",75,86);
	   
	   System.out.println(ap1.eleBill);
	   System.out.println(ap1.houseName);
	   System.out.println(ap1.houseNo);

	}

}
