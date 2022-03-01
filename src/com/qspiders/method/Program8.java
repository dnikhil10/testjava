package com.qspiders.method;

public class Program8 
{
	public static void main(String[] args) 
	{
		for(int b=0;b<2;b++)
		{
			for(int a=1;a<4;a++)
			{
			System.out.println("hiii");
			}
			System.out.println("end of loop");
		}
		int num=54;
		int sum=0;
		while (num!=0)
		{
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		System.out.println(sum);
	}
}
