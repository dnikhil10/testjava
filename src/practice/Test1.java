package practice;
class Car
{
	void startEngine()
	{
		System.out.println("start the enginee");
	}
}
class Person
{
	void travel(Car ref)
	{
		System.out.println("travel by car");
		ref.startEngine();
	}
}
public class Test1 {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.travel(new Car());
	
	}

}
