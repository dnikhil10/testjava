package com.qspider.encap;
class  Pattern7
{
	public static void main(String[] args) 
	{
		for (int rows=1; rows<=15; rows++)
		{
			for (int col=1;col<=15 ;col++ )
			{
				if (rows==1||rows==15||rows==8||rows==col||col==1||col==15||rows+col==16)
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

