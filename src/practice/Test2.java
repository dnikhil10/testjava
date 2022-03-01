package practice;
class GeneralTicket
{
	void travel()
	{
		System.out.println("travel in the train");
	}
}
class SleeperTicket extends GeneralTicket
{
	void berth()
	{
		System.out.println("u get confirm berth");
	}
	void sleep()
	{
		System.out.println("sleep in the train");
	}
}
class AcTicket extends SleeperTicket
{
	void temperature()
	{
		System.out.println("get the prefered temperature");
	}
}
class Passenger
{
	void generalCompartment(GeneralTicket g1)
	{
		g1.travel();
	}
	void sleeperCompartment(SleeperTicket s1)
	{
		s1.travel();
		s1.sleep();
		s1.berth();
	}
	void acCompartment(AcTicket a1)
	{
		a1.travel();
		a1.berth();
		a1.sleep();
		a1.temperature();
	}
}
public class Test2 {

	public static void main(String[] args) {
	Passenger p1=new Passenger();
	p1.generalCompartment(new GeneralTicket());
	//p1.generalCompartment(new AcTicket());
	//p1.generalCompartment(new SleeperTicket());
	
	p1.sleeperCompartment(new SleeperTicket());
	//p1.sleeperCompartment(new AcTicket());//upcasting
	
	p1.acCompartment(new AcTicket());
	}

}
