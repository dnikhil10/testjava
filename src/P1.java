
public class P1 {
	
	 int a=1;
	
	static void recursion(int a)
	{
		
		if(a<=10)
		{
			System.out.print(a+" ");
			a++;
			recursion(a);
		}
		
	}

	public static void main(String[] args) 
	{
		System.out.println("im main method");
	  recursion(1);

	}

}
