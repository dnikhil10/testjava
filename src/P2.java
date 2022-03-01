
public class P2 {
	
	public static void test(int a)
	{
		if(a>=1)
		{
			
			System.out.print(a+ " ");
			a--;
			test(a);
		}
		
	}
	public static void test1(int b)
	{
		if (b<=9)
		{
			System.out.print(b+" ");
			b++;
			test1(b);
		}
		
	}
	public static void main(String[] args) 
	{
	  test(9);
	  test1(2);
		
	
	}

}
