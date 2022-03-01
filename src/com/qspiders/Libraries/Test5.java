package com.qspiders.Libraries;
class Gun
{
	
}
public class Test5 {

	public static void main(String[] args) {
	String s1=new String("csk");
	System.out.println(s1.toString());
	
	String s2="csk";
	System.out.println(s2);
	
	String s3="xyz";
	System.out.println(s3.hashCode());
	
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	String v1="hii";
	System.out.println("v1="+v1);
	
	String v2=new String("hii");
	System.out.println("v2="+v2);
	
	String v3="hii";
	System.out.println("v3="+v3);
	
	String v4=new String("hii");
	System.out.println("v4="+v4);
	
	System.out.println(v1==v3);
	System.out.println(v3.equals(v4)); 
	
	String t1="testing";
	System.out.println(t1.length());
	System.out.println(t1.charAt(6));//index value starts from 0
	
	char [] ar=t1.toCharArray();
	for (int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	}
}

}
