package com.qspiders.method;
class hrDepartment
{
	static String wc="hii";
	static String sname=" hello";
	static String jio=wc+sname;
	void hiring()
	{
		System.out.println("Start hiring for projects");
	}
}
class ProductDepartment
{
	static int staff=50;
	static int noOfProjects=5;
	void work()
	{
		System.out.println("work on their respective projects");
	}
}
public class Program15 
{
	static String companyName="6e";
	static int totalStaff=200;
	
	public static void main(String[] args)
{
	System.out.println(companyName);
	System.out.println(totalStaff);
	System.out.println(ProductDepartment.staff);
	System.out.println(ProductDepartment.noOfProjects);
	System.out.println(hrDepartment.jio);
	new hrDepartment().hiring();
	new ProductDepartment().work();
}

}
