package Inheritance;
class Owner
{
	void house()
	{
		System.out.println("old house");
	}
}
class Tentant extends Owner
{
	void house()
	{
		System.out.println("house modifed");
	}
}
public class Mainclass3 {

	public static void main(String[] args)
	{
	   Tentant t1=new Tentant();
	   t1.house();

	}

}
