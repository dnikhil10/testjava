
public class PrimeNo {
	
	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			
			if(num%i==0)
			{
				return false;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
	boolean	res=isPrime(6);
	System.out.println("the number is prime "+res);
	

	}

}
