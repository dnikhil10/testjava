package Inheritance;
class Vtu
{
	void syllabus()
	{
		System.out.println("for all engineering syallabus");
	}
}
class Dsce extends Vtu
{
	int admission(int fees)
	{
		System.out.println("no of admission is");
		return 3000;
	}
}
public class Test0 
{
public static void main(String[] args) 
	{
		Dsce d1=new Dsce();
		int fees=d1.admission(50000);
		System.out.println(fees);
		d1.syllabus();
		}
}
