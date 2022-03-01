package com.qspider.encap;
class  Pattern9
{
	public static void main(String[] args) 
	{
		int n=4;
		for (int rows=1; rows<=n; rows++)
		{
			for (int col=1;col<=n ;col++ )
			{
				if (rows<=col)
				{
					System.out.print("* ");
				}
				else
				{
                     System.out.print("  ");
				}
			}
				System.out.println("");

			}
		}
	}

