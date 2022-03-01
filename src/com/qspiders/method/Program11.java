package com.qspiders.method;

public class Program11 
{
  public static void gmail(String name,int id,long mobileno)
  {
	  System.out.println(name);
	  System.out.println(id);
	  System.out.println(mobileno);
	  System.out.println("Gmail login successful");
	  boolean score=marks("history");
	  System.out.println(score);
  }
  public static void main(String[] args) 
  {
	  String appName="gmail";
	  gmail("java",1234,8971008303l);
	  System.out.println(appName);
	  gmail("hii",4567,7766554433l);
  }
  public static boolean marks (String papers)
  {
	  System.out.println(papers);
	  return true;
  }
}
