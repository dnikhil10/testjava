package Oops;
class Fly
{
	String source;
	String des;
	byte noofppl;
	Fly(String so,String de,byte noppl)
	{
		source=so;
		des=de;
		noofppl=noppl;
	}
}

public class Test2 
{
	public static void main(String[] args) 
	{
		byte noofppl=10;
       Fly f1=new Fly("newyork","blr",noofppl);
       
       
	}

}
