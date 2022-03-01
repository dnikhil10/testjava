package practice;
class Father
{
	void house()
	{
		System.out.println("old and grumpy house");
	}
}
class Son extends Father
{
	void house()
	{
		System.out.println("new and modified house");
	}
}
public class Test4 {

	public static void main(String[] args) {
	Father f1=new Son();
	f1.house();

	}

}
