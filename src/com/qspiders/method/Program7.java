package com.qspiders.method;

public class Program7 
{
	public static void main(String[] args) 
{ 
		boolean aptitude=true;
		boolean technicalInterview=true;
		if (aptitude==true && technicalInterview==true)
		{
			boolean hrInterview=true;
			if (hrInterview==false)
			{
				System.out.println("ur placed");
			}
			else
			{
				System.out.println("Better luck next time");
			}
		}
		else
		{
			System.out.println("Try another company");
		}
		int c=14;
		int d=25;
		boolean res= c<d && ++c < ++d;
		System.out.println(c);
		System.out.println(d);
		System.out.println(res);
		
		int e=14;
		int f=25;
		boolean res2= e<f || ++e<++f;
		System.out.println(e);
		System.out.println(f);
		System.out.println(res2);
				
}
}
