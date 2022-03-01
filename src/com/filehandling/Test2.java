package com.filehandling;
class RainException extends Exception
{
	
}
class Cricket
{
	void play(boolean rain) throws RainException
	{
	  System.out.println("start toss..");
	  if (rain==false)
	  {
		  System.out.println("play match");
	  }
	  else
	  {
		  throw new RainException();
	  }
	}
}

public class Test2 {

	public static void main(String[] args){
		try {
	Cricket c=new Cricket();
	c.play(false);
		}
		catch (RainException r1)
		{
			r1.printStackTrace();
		}
		

	}

}
