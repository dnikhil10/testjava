package eduraka.java;

interface Car
{
   void speed();
   int milage();
}
interface Jk extends Car
{
	
}
class Scooter
{
	
	void run()
	{
		System.out.println("run like scooter");
	}
}
class Bus extends Scooter implements Car 
{
	int a=30;
	Bus()
	{
		System.out.println(this.a);
	}
	
	public int milage()
	{
		return 100;
	}
	public void speed()
	{
		System.out.println("run at high speed");
	}
}
public class Test4 {

	public static void main(String[] args) {
		int x=5;
		x|=3;
		System.out.println(x);
		Bus b=new Bus();
		b.run();
		b.speed();
		Car c=new Bus();
		c.speed();


	}

}
