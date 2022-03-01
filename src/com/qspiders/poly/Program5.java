package com.qspiders.poly;
class AplCard
{
	String name;
	int age;
	char gender;
	
	void details(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
    }
	void identity()
	{
		System.out.println("Proof as citizen of India");
	}
}
class BplCard extends AplCard
{
	void ration()
	{
		System.out.println("Get ration at affordable prices at govt stores");
	}
	void healthCare()
	{
		System.out.println("Get health care free of cost at govt hospitals");
	}
}
class GovtServices
{
	void candidate(AplCard ref)
	{
	    System.out.println("Services available based on card");
	    ref.details("Java",45,'M');
	    System.out.println("Name="+ref.name);
	    System.out.println("Age="+ref.age);
	    System.out.println("Gender="+ref.gender);
		ref.identity();
		//ref.ration();
		//ref.healthCare();
	}
}
public class Program5 
{
	public static void main(String[] args) 
   {
	GovtServices g1=new GovtServices();
	g1.candidate(new BplCard());// upcasting
	}

}
