package eduraka.java;

import java.util.Scanner;

public class Program1
{
    private static final Scanner s=new Scanner(System.in);
    		
  public static void main(String[] args)
  {
	int n=s.nextInt();
	s.nextLine();
	String line=s.nextLine();
	System.out.println(line);
	System.out.println("n value="+n);
	
	if (n%2==0)
	{
		if (2<=n && n<=5)
		{
			System.out.println("not weird"); 
		}
		else if (6<=n && n<=20)
		{
			System.out.println("not weird");
		}
		else
		{
			System.out.println("weird");
		}
	}
	else
	{
		System.out.println("weird");
	}
  }

}
