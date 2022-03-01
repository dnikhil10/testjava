package com.qspiders.Libraries;

import java.io.IOException;

class Developer
{
	void coding () throws IOException
	{
		System.out.println("start the coding");
		throw new IOException();
	}
}
class TeamLead
{
	void leadProject() throws IOException
	{
		System.out.println("lead the project");
		Developer d1=new Developer();
		d1.coding();
	}
}
class ProjectManager
{
	void assignProject() throws IOException
	{
		System.out.println("Project manger assign the project");
		TeamLead t1=new TeamLead();
		t1.leadProject();
	}
}
public class Test11 {

	public static void main(String[] args) {
	System.out.println("main method");
	try
	{
	ProjectManager pm=new ProjectManager();
	pm.assignProject();
	}
	catch (IOException ref)
	{
		System.out.println("exception handled ");
		ref.printStackTrace();
	}

}

}
