package com.qspiders.method;
public class Program4 
{
	static String name="java";
    static int userid=897100;
	static char gender='M';
	static int read(String name,int userid,char gender)
	{
	
		System.out.println("when u read correcttly..");
		return 500;
	}
	public static void main(String[] args) 
	{  
		System.out.println("Student name="+name);
		System.out.println("Roll no="+userid);
		System.out.println("Gender="+gender); 
		int ref=read("java",87656,'m');
		System.out.println("marks="+ref);
		play();
	}
	static void play()
	{
		String sportName="kabadi";
		int noofPlayers=10;
		float pitchSize=7.98f;
		sportName="cricket";
		noofPlayers=15;
		System.out.println(sportName);
		System.out.println(noofPlayers);
		System.out.println(pitchSize);
		System.out.println("play hard.......");
	}
}
