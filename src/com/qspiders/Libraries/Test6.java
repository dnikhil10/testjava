package com.qspiders.Libraries;

public class Test6 {

	public static void main(String[] args) {
    StringBuilder s1=new StringBuilder("testing");
    s1.append("java");
    System.out.println(s1);
    StringBuilder str = s1.reverse();
    System.out.println(str);
    
    StringBuffer s2=new StringBuffer("java");
    StringBuffer s3=new StringBuffer("java");
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s2==s3);
    System.out.println(s2.equals(s3));
    
    String s4=new String("java is easy");
    String s5=new String("java is easy");
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s4.equals(s5));
    
	}

}
