package Oops;
class Ref2
{
	int a;
	Ref2()
	{
		this.a=89;
		System.out.println(this.a);
		System.out.println("Zero argument constructor");
	}
	Ref2(int b)
	{
		//this();
		System.out.println(b);
		System.out.println("Parmeterised constructor");
		this();
	}
}
public class Test8 {

	public static void main(String[] args) {
		Ref2 r2=new Ref2(77);
		//Ref2 r3=new Ref2(77);

	}

}
