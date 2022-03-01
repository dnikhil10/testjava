package com.qspiders.poly;
class Builders
{
	void buildApartment()
	{
		System.out.println("Build the apartment..");
	}
}
class Godrej extends Builders
{
	void buildApartment()
	{
		System.out.println("Build the apartment as per Godrej standards");
	}
}
class Prestige extends Builders
{
	void buildApartment()
	{
		System.out.println("Build the apartment as per Prestige standards..");
	}
}
class Shobha extends Builders
{
	void buildApartment()
	{
		System.out.println("Build the apartment as per Shobha standards..");
	}
}
class Customer
{
	void bookApartment(Builders ref)
	{
		ref.buildApartment();
	}
}
public class Program9 
{public static void main(String[] args) 
{
	Customer c1=new Customer();
    c1.bookApartment(new Godrej());
    c1.bookApartment(new Prestige());
    c1.bookApartment(new Shobha());
}

}
