package com.qspiders.method;

public class Program6 
{
	public static void main(String[] args) 
{
	int x=4;
	int y=1;
	int res= ++x + ++y + ++y + ++x;
	System.out.println(res);
	System.out.println(x);
	System.out.println(y);
	int a=4;
	int b=1;
	int ref= a++ + b++ + b++ + a++;
	System.out.println(a);
	System.out.println(b);
	System.out.println(ref);
	int c=10;
	//int re=c++;
	System.out.println(c++);
	System.out.println(c);
	float f=7.5f;
	System.out.println(++f);
	char h1='0';
	System.out.println(h1);
	char a1='0';
	char a2='1';
	int f1=a1+a2;
	System.out.println(f1);
	System.out.println(25%4);
	int f2=675;
	long f3=75;
	long  r1=f2+f3;
	System.out.println(r1);
	int f4=35;
	float f5=5.5f;
	float f6=f4+f5;
	System.out.println(f6);
	System.out.println(true);
	System.out.println(!false);
	
}
}
