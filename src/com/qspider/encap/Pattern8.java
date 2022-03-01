package com.qspider.encap;
class  Pattern8
{
	public static void main(String[] args) 
	{
		int n=6;
		for (int rows=1; rows<=n; rows++)
		{
			for (int col=1;rows+col<=n+1 ;col++ )
			{
				System.out.print("* ");
			}
			System.out.println("");

			}
		}
	}

