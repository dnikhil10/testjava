package com.qspiders.abstraction;
abstract class PmCares
{
	void charity(int money)
	{
		System.out.println("Help for covid ppl");
	}
	abstract void audit();
}
abstract class Pmnrf extends PmCares
{
	abstract void spending();
}
class SupremeCourt extends Pmnrf
{
	void audit()
	{
		System.out.println("audit not done");
	}
	void spending()
	{
		System.out.println("spending will not be disclosed");
	}
}
public class Test1 {

	public static void main(String[] args)
	{
		SupremeCourt s1=new SupremeCourt();
		s1.audit();
		s1.charity(67540);
		s1.spending();
	}
}
