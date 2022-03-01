package com.nikhil.practice;

import java.lang.reflect.Array;

public class Test2 {
	
	

	public static void main(String[] args) 
	{
		
		char [] values= {'h','l','l','e','o'};
		
		for (char values1:values)
		{
			System.out.println(values1);
		}
    String s1=new String(values);
    System.out.println(s1);
    
    String [] words= {"hii","hello","java","python"};
     System.out.println(words[0]);
     
     for(String w:words)
     {
    	 System.out.println(w);
     }
     
     int [] num= {1,2,3,4,5};
     int sum=0;
     for(int i=0;i<num.length;i++)
     {
    	 sum=sum+num[i];
     }
     System.out.println(sum);
	
     String s2="India";
     
     System.out.println();
}

	
}
