package eduraka.java;

import java.util.Scanner;

abstract class Account
{
	abstract void accountNo();
	abstract void name();
	abstract void amount();
	void deposit()
	{
		System.out.println("deposit the amount");
	}
	void withdraw()
	{
		System.out.println("withdraw from the amount");
	}
}

final class SbAccount extends Account 
{
	int sbInterestperMonth=4;
	final int sbMinBalance=500;
	void accountNo()
	{
		System.out.println("its SB account");
	}
	void name()
	{
		System.out.println("The name of sb account");
	}
	void amount()
	{
		System.out.println("the amount in sb account");
	}
	void deposit()
	{
		System.out.println("deposit in the SB amount");
	}
	void withdraw()
	{
		System.out.println("withdraw from the sb amount");
	}
}
final class CurrentAccount extends Account
{
	final int curMinBalance=5000;
	void accountNo()
	{
		System.out.println("its current account");
	}
	void name()
	{
		System.out.println("The name of current account");
	}
	void amount()
	{
		System.out.println("the amount in current account");
	}
	void deposit()
	{
		System.out.println("deposit in the Current amount");
	}
	void withdraw()
	{
		System.out.println("withdraw from the current amount");
	}
}
public class Test0 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String type = s.next();
	    System.out.println("type="+type);
	    if(type.equals("current"))
	    	{
	    		Account c1=new CurrentAccount();
	    		//System.out.println("min balance="+c1.curMinBalance);
	    		c1.accountNo();
	    		c1.amount();
	    		c1.name();
	    		c1.deposit();
	    		c1.withdraw();
	    	}
	    else if (type.equals("saving"))
	    {
	    	SbAccount s1=new SbAccount();
	    	System.out.println("min balance="+s1.sbMinBalance);
	    	System.out.println("interest per month="+s1.sbInterestperMonth);
	    	s1.accountNo();
	    	s1.amount();
	    	s1.name();
	    	s1.deposit();
	    	s1.withdraw();
	    }
	    else
	    {
	    	System.out.println("no such account exists");
	    }
	}

}
