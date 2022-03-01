package practice;
class Walk
{
	void walk()
	{
		System.out.println("start walking");
	}
}
class Jogging extends Walk
{
	void jog()
	{
		System.out.println("start jogging");
	}
}
class Run extends Jogging
{
	void run()
	{
		System.out.println("start running");
	}
}
public class Test3 {

	public static void main(String[] args) {
	 Walk w1=new Jogging();
	if (w1 instanceof Run)
	{
		Run r1=(Run)w1;
		System.out.println("downcasted succesfully");
		
	}
	else 
	{
		System.out.println("downcasting not successful");
	}
	Jogging j1=(Jogging)w1;// downcasting
	j1.jog();
	j1.walk();

	}

}
