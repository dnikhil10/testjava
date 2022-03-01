package com.filehandling;

class Product 
{
	String name;
	int id;
	int cost;
	public Product(String name,int id,int cost)
	{
		this.name=name;
		this.id=id;
		this.cost=cost;
	}
	public boolean equals(Object ob)
	{
		Product ptn=(Product)ob;
		return this.name==ptn.name;
	}
}

public class Test0 {

	public static void main(String[] args) {
		String r1=new String("boy");
		String r2=new String("boy");
		System.out.println(r1.hashCode());//hashcode method is overidden in String 
		System.out.println(r2.hashCode());
		System.out.println(r1==r2);
		System.out.println("equals method overidden in string class="+r1.equals(r2));
	    System.out.println(r1.toString());
		
    
    Product p1=new Product("oil",67,20);
    Product p2=new Product("oil",68,20);
    System.out.println(p1.equals(p2));
    System.out.println(p1==p2);
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    
    
    
    StringBuffer sb1=new StringBuffer("run");
    StringBuffer sb2=new StringBuffer("jogg");
    System.out.println("equals method not overideen in string buffer and String builder="+sb1.equals(sb2));
    
	}

}
