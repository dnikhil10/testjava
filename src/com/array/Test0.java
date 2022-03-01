package com.array;

public class Test0 {
	
	static void array()
	{
		double[]div= {78.67,65.56,88,87,99.76};
		for (double val:div)
		{
			System.out.println(val);
		}
		div[2]=3.142;
		for (int i=0;i<div.length;i++)
		{
			System.out.println(div[i]);
		}
	}

	public static void main(String[] args) {
	 int[]ar= {1,2,3,4,5};
	 int sum=0;
	 System.out.println("array o index"+ar[0]);
	 for (int i=0;i<ar.length;i++)
	 {
		 System.out.println(ar[i]);
		 sum=sum+ar[i];
		 
	 }
	 System.out.println(sum);
	 array();
	}

}
